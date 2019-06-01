package codechef;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;

public class SampleProblem {



	static void test() {
		String s1="abc";
		String s2="abc";
		String s3="abc";
		StringBuffer b=new StringBuffer();

		HashMap<Character, Integer> map=new HashMap<>();

		for(int i=0;i<s1.length();i++)
			map.put(s1.charAt(i), 0);

		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s2.length();i++)
		{
			set.add(s2.charAt(i));
		}
		set.forEach(c->{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
		});
		}




		


		static long gcd(long a, long b) 
		{ 
			// Everything divides 0  
			if (a == 0 || b == 0) 
				return 0; 

			// base case 
			if (a == b) 
				return a; 

			// a is greater 
			if (a > b) 
				return gcd(a-b, b); 
			return gcd(a, b-a); 
		} 

		// method to return LCM of two numbers 
		static long lcm(long a, long b) 
		{ 
			return (a*b)/gcd(a, b); 
		}

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

		/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		try {
			String N=r.readLine();
			String[] input1=N.split(" ");
			int threshold=Integer.parseInt(input1[1]);
			String s;
			while ((s=r.readLine())!=null)
			{
				int value=Integer.parseInt(s);
				if(value>=threshold)
					System.out.println("Good boi");
				else
					System.out.println("Bad boi");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			/*String s="5 21 4";
		int arr[][]=new int[10][1];

		System.out.println(arr.length);*/
			//System.out.println(200/3);
			//System.out.println(gcd(1000000000000000000l, 9999999999999999l));
			/*String a = "36594652830916364940473625749407"; 
			String b = "448507083624364748494746353648484939"; 
			System.out.println(lcm(a,b));*/
			
			System.out.println(6/4);
		}

	}
