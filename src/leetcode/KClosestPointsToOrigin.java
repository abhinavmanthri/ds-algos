package leetcode;

/*https://leetcode.com/problems/k-closest-points-to-origin
 * Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
 */


public class KClosestPointsToOrigin {
	
	public int findMax(double[] arr)
	{
		int index=0;
		double max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				System.out.println("max: "+arr[i]);
				max=arr[i];
				index=i;
			}
					
		}		
		return index;
	}

	public int[][] kClosest(int[][] points, int k) {
		
		if(k==0 || points==null)
			return null;
		if(points.length==k)
			return points;
		
		int[][] res=new int[k][2];
		double[] min=new double[k];
		
		for(int i=0;i<k;i++)
		{
			//System.out.println(i+" "+k);
			res[i][0]=points[i][0];
			res[i][1]=points[i][1];
			double distance=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
			min[i]=distance;
		}
		for(int i=k;i<points.length;i++)
		{
			double dis=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
			
			int max_index=findMax(min);
			System.out.println("found max index: "+max_index);
			if(min[max_index]>dis)
			{
				min[max_index]=dis;
				res[max_index][0]=points[i][0];
				res[max_index][1]=points[i][1];
			}
			
			
		}
		
		return res;

	}

	public static void main(String[] args) {
		KClosestPointsToOrigin obj=new KClosestPointsToOrigin();
		
		int[][] arr= {{3,2},{7,7},{9,-9},{4,-6},{-3,-6}};
		
		int[][] ar=obj.kClosest(arr, 4);
		System.out.print(ar[0][0]+ " ");
		System.out.println(ar[0][1]);
		System.out.print(ar[1][0]+ " ");
		System.out.println(ar[1][1]);
		
		System.out.print(ar[2][0]+" ");
		System.out.println(ar[2][1]);
		System.out.print(ar[3][0]+" ");
		System.out.println(ar[3][1]);

	}

}
