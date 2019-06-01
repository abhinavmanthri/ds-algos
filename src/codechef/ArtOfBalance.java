package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class ArtOfBalance {

	/*static boolean isPrime(int n) 
	{ 
		// Corner cases 
		if (n <= 4) return false; 
		// if (n <= 3) return true; 

		// This is checked so that we can skip  
		// middle five numbers in below loop 
		if (n % 2 == 0 || n % 3 == 0) return false; 

		for (int i = 5; i * i <= n; i = i + 6) 
			if (n % i == 0 || n % (i + 2) == 0) 
				return false; 

		return true; 
	} */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = null;


		String s;

		r = new BufferedReader (new InputStreamReader (System.in));
		if ((s=r.readLine())!=null)
		{
			int test_cases=Integer.parseInt(s);

			for(int i=0;i<test_cases;i++)
			{

				s=r.readLine();
				HashMap<Character, Integer> map=new HashMap<>();
				int length=s.length();

				// adding to map with characters and its count
				for(int j=0;j<length;j++)
				{
					char c=s.charAt(j);
					if(map.containsKey(c))
						map.put(c,map.get(c)+1);
					else
						map.put(c, 1);
				}

				int size=map.size();
				//System.out.println("total length: "+length);
				//System.out.println("total uniqe characters: "+size);
				/*if(isPrime(length))
				{
					int max=map.values().stream().collect(Collectors.summarizingInt(Integer :: intValue)).getMax();
					//System.out.println("max: "+max);
					System.out.println(length-max);
				}
				else
				{*/


				int minResult=Integer.MAX_VALUE;
				while(size>0)
				{
					while(length%size!=0)
						size--;

					int result=0;
					int temp=size;
					int eachSize=length/size;						
					int extra=0;

					System.out.println("each size: "+eachSize+"   total count: "+size);
					Iterator<Integer> itr=map.values().stream().sorted(Comparator.reverseOrder()).iterator();
					while(itr.hasNext() && temp>0)
					{
						int n=itr.next();
						//System.out.println("current char size: "+n);

						if(extra!=0 && n<eachSize)
						{
							if(n+extra>=eachSize)
							{

								extra=extra+n-eachSize;
								temp--;								

								continue;
							}
						}

						if(n>eachSize)
						{
							result=result+n-eachSize;

							extra=extra+n-eachSize;

						}
						else if(n<eachSize)
							result=result+eachSize-n;
						temp--;

						//System.out.println("extra: "+extra);
						//System.out.println("result: "+result);
						//System.out.println("temp: "+temp);
					}
					System.out.println("current result: "+result);
					minResult=Math.min(minResult,result);
					size--;
				}
				System.out.println(	minResult);

			}




		}

	}
}

