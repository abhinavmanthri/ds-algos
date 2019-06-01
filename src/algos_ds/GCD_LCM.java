package algos_ds;

public class GCD_LCM {
	
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	public static int lcm(int a ,int b) {
		return a*b/gcd(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(10, 15));
		System.out.println(lcm(10, 15));

	}

}
