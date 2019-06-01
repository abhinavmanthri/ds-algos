package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReduceToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			r.readLine();
			//int t_count=Integer.parseInt(r.readLine());
			while ((s=r.readLine())!=null)
			{
				int n = Integer.parseInt(s);
				System.out.println(stirlingFactorial(n));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return;

	}
	public static long stirlingFactorial(double n) 
	{ 
	    if (n == 1) 
	        return 1; 
	    double z; 
	    double e = 2.71; // value of natural e 
	      
	    // evaluating factorial using 
	    // stirling approximation 
	    z = Math.sqrt(2 * 3.14 * n) * 
	        Math.pow((n / e), n); 
	    return (long)(z); 
	} 
	/*static long factorial(int n) {

		long result[] =new long[n+1];
		result[0] = 1;
		for ( int i = 1; i <= n; ++i) {
	         result[i] = (i * result[i-1])%1000000007;
	      }

		return result[n];
	}*/

/*	static long factorial(long n) {
		long res = 1, i;
		int result[] =new int[1000];
		for (i = 2; i <= n; i++) {
			//System.out.println("res: "+res);
			res = (res*i)%1000000007;
		}

		return res;
	}*/

}

/*
 * int n=rowIndex; int r=n+1; int[] nCr=new int[n+1]; nCr[0]=1; for(int
 * i=1;i<=n;i++) { for(int j=Math.min(i, r);j>0;j--) { nCr[j]=nCr[j]+nCr[j-1];
 * 
 * } } List<Integer> list=new ArrayList<Integer>(); for(int k : nCr)
 * list.add(k);
 * 
 * return list;
 */