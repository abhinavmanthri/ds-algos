package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LuckyNumberGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));


		String s;

		if ((s=r.readLine())!=null)
		{
			int test_cases=Integer.parseInt(s);
			/*for(int i=0;i<test_cases;i++)
			{*/
			int count=0;
			while((s=r.readLine())!=null)
			{
				int[] array=Arrays.stream(s.split(" ")).mapToInt( Integer :: parseInt).toArray();


				if((s=r.readLine())!=null)
				{
					if(count++%2==0)
						find(s, array[0],array[1], array[2],"BOB","ALICE");
					else
						find(s, array[0],array[1], array[2],"ALICE","BOB");

				}
			}
			/*}*/

			r.close();
		}



	}

	public static void find(String data,int length,int n1, int n2,String p1,String p2)
	{
		//ArrayList<Integer> list=new ArrayList<>();

		int[] list=Arrays.stream(data.split(" ")).mapToInt( Integer :: parseInt).filter(x->(x>0 && (x%n1==0 || x% n2==0))).toArray();


		while(true)
		{
			boolean flag=false;
			for(int i=0;i<list.length;i++)
			{

				if(list[i]==0)
					continue;
				if(list[i]%n1==0)
				{
					list[i]=0;
					flag=true;
					//System.out.println("removed");
					break;
				}
			}
			//System.out.println(list);
			if(!flag)
			{
				System.out.println(p2);
				break;
			}
			flag=false;
			for(int i=0;i<list.length;i++)
			{
				if(list[i]==0)
					continue;					

				if(list[i]%n2==0)
				{
					list[i]=0;
					flag=true;
					//System.out.println("removed");
					break;
				}
			}
			//System.out.println(list);
			if(!flag)
			{
				System.out.println(p1);
				break;
			}

		}
	}

}
