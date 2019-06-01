package algos_ds;

public class CheckPalindrome {
	
	// finding reverse half number and checking 
	// what if reversed number is bigger than given integer
	// o(log(n) base 10)
	
	public static boolean checkPalindrome(int x)
	{
		if( x<=0 || x%10==0 )
			return false;
		int reverseHalf=0;
		
		while(x>reverseHalf)
		{
			reverseHalf=reverseHalf*10+x%10;
			x=x/10;
		}
		
		if(x==reverseHalf || x==reverseHalf/10)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkPalindrome(11211));

	}

}
