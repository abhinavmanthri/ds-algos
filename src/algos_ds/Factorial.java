package algos_ds;

public class Factorial {
	static int count;

	static int factorial(int n)
	{
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	static int printFib(int n1,int n2)
	{
		/*int n1=1,n2=1;
		int sum=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<101;i++)
		{
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}*/
		if(count==10)
		{			
			return n1+n2;
		}
		count++;
		System.out.print(n1+n2+" ");
		return printFib(n2, n1+n2);
		
	}
	
	// find nth element in fibonacci series
	static long recursiveFind(long n)
	{
		if(n<=1)
			return 1;
		return recursiveFind(n-1)+recursiveFind(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(factorial(5));
		//System.out.println(printFib(0,1));
		
		System.out.println(recursiveFind(110));

	}

}
