package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HMAPPY2 {

	public static BigInteger lcm(String a, String b) 
    { 
        // convert string 'a' and 'b' into BigInteger 
        BigInteger s = new BigInteger(a); 
        BigInteger s1 = new BigInteger(b); 
  
        // calculate multiplication of two bigintegers 
        BigInteger mul = s.multiply(s1); 
  
        // calculate gcd of two bigintegers 
        BigInteger gcd = s.gcd(s1); 
  
        // calculate lcm using formula: lcm * gcd = x * y 
        BigInteger lcm = mul.divide(gcd); 
        return lcm; 
    } 

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//long startTime = System.nanoTime();
		BufferedReader r = null;


		String s;
		try {
			r = new BufferedReader (new InputStreamReader (System.in));
			if ((s=r.readLine())!=null)
			{
				int test_cases=Integer.parseInt(s);

				for(int i=0;i<test_cases;i++)
				{
					if ((s=r.readLine())!=null)
					{

						/*long[] array=Arrays.stream(s.split(" ")).mapToLong( Long :: parseLong).toArray();
					long N=array[0];
					long A=array[1];
					long B=array[2];
					long K=array[3];*/
						String[] array=s.split(" ");
						if(array.length==4)
						{
							long N=Long.parseLong(array[0]);
							long A=Long.parseLong(array[1]);
							long B=Long.parseLong(array[2]);
							long K=Long.parseLong(array[3]);

							long temp=0;
							if(N!=0 && A!=0 && B!=0)
							{
								long a=N/A;
								long b=N/B;
								
								
								long c=N/lcm(array[1],array[2]).longValue();
								temp=a+b-2*c;
							}

							if(temp>=K)
								System.out.println("Win");
							else
								System.out.println("Lose");


						}
					} 
				}
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Lose");
		}
		finally	
		{
			try {
				r.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Lose");
			}
		}

		//long endTime   = System.nanoTime();

	}

}
