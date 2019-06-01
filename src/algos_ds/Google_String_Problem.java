package algos_ds;

public class Google_String_Problem {
	
	public static String[] getResult(int[] arr) {
		
		String result="";
		boolean carryOn=false;
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[i];
			if(i==arr.length-1)
			{
				temp=temp+1;
			}
			if(carryOn)
			{
				temp=arr[i]+1;
				carryOn=false;
			}
			if(temp==10)
			{
				carryOn=true;
				result="0"+","+result;
				//System.out.println(result);
			}
			else
			{
				result=temp+","+result;
			}
		}
		if(carryOn)
			result="1"+","+result;
		System.out.println(result);
		return result.split(",");
	}

	public static void main(String[] args) {
		
		int arr[]= {8,9,9,9};
		String[] s=Google_String_Problem.getResult(arr);
		for(String ss:s)
		{
			System.out.print(ss+",");
		}
	}

}
