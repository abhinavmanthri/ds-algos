package leetcode;

public class FirstMissingPositive {
	
	public static int firstMissingPositive(int[] nums) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<nums.length;i++)
		{
			sb.append(" "+nums[i]+" ");
		}
		String s=sb.toString();
		for(int j=1;j<=nums.length;j++)
		{
			if(!s.contains(" "+j+" "))
				return j;
		}
		return nums.length+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,4,-1,1};
		System.out.println(firstMissingPositive(nums));

	}

}
