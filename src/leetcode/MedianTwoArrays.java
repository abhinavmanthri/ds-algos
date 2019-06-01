package leetcode;

public class MedianTwoArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length==0 && nums2.length==0)
			return 0;
		int size1=nums1.length;
		int size2=nums2.length;
		
		int req=(size1+size2)/2;
		//System.out.println("req: "+req);
		int i=0;
		int j=0;
		boolean flag=false;
		int temp=0;
		while(true)
		{
			if(temp==req)
				break;
			
			if(i==size1)
			{
				j++;
				flag=false;
			}
			else if(j==size2)
			{
				i++;
				flag=true;
			}
			else
			{
				if(nums1[i]<nums2[j])
				{
					i++;
					flag=true;
				}
				else
				{
					j++;
					flag=false;
				}
					
			}
			temp++;
		}
		//System.out.println("i: "+i+"    j:"+j);
		if((size1+size2)%2!=0)
		{
			if(flag)
			{
				if(i==size1)
					return nums2[j];
				else if(j==size2)
					return nums1[i];
				else
				{
					if(nums1[i]<nums2[j])
						return nums1[i];
					else
						return nums2[j];
				}
			}
				
			else
			{
				if(j==size2)
					return nums1[i];
				else if(i==size1)
					return nums2[j];
				else
				{
					if(nums1[i]<nums2[j])
						return nums1[i];
					else
						return nums2[j];
				}
			}
				
		}
		else
		{
			if(flag)
			{
				if(i==size1)
					return (double)(nums1[--i]+nums2[j])/2;
				else if(j!=size2)
				{
					if(nums1[i]<nums2[j])
						return (double)(nums1[--i]+nums1[++i])/2;
					else
						return (double)(nums1[--i]+nums2[j])/2;
				}
				else
				{	//System.out.println("else: i "+i);
					return (double)(nums1[--i]+nums1[++i])/2;
				}
			}
			else
			{
				if(j==size2)
					return (double)(nums2[--j]+nums1[i])/2;
				else if(i!=size1)
				{
					if(nums1[i]<nums2[j])
						return (double)(nums1[i]+nums2[--j])/2;
					else
						return (double)(nums2[--j]+nums2[++j])/2;
				}
				else
				{
					//System.out.println(" else j: "+(j-1)+"  "+j+1);
					return (double)(nums2[--j]+nums2[++j])/2;
				}
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {};//012345678
		
		int[] nums2 = {2,3,4,5,8};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));


	}

}
