package algos_ds;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-8,1,4,-9,5,-3,-1}; //-3,-1,1,4,5
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			
				
			if(arr[i]<0)
			{
				if(i==index)
				{
					index++;
					continue;
				}
				int temp=i;
				int neg=arr[i];
				while(temp>index)
				{
					arr[temp]=arr[temp-1];
					temp--;
				}
				arr[index]=neg;
				index++;
				
				
				
			}
			
		}
		for(int a: arr)
			System.out.print(a+" ");
		
		
		
	}

}
