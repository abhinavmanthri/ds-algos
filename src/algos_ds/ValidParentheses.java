package algos_ds;

public class ValidParentheses {
	
	public static boolean isValid(String s) {
        boolean flag1=true;
        boolean flag2=true;
        boolean flag3=true;
        char[] arr=s.toCharArray();
        for( char c : arr)
        {
        	/*if(c=='(')
        		flag1=false;
        	else if(c==')')
        		flag1=flag1==true?false:true;
        	else if(c=='{')
        		flag2=false;
        	else if(c=='}')
        		flag2=flag2==true?false:true;
        	else if(c=='[')
        		flag3=false;
        	else if(c==']')
        		flag3=flag3==true?false:true;*/
        	char previous=c;
        }
        
        return (flag1 && flag2 && flag3);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("([)]"));

	}

}
