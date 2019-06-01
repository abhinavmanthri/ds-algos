package algos_ds;



public class Sorting {
	
	public static void merge(int[] ar,int start,int middle,int end)
	{
		int n1=middle-start+1;
		int n2=end-middle;
		
		int[] temp1=new int[n1];
		int[] temp2=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			temp1[i]=ar[i+start];
		}
		for(int i=0;i<n2;i++)
		{
			temp2[i]=ar[i+middle+1];
		}
		
		int k=start;
		
		int i=0,j=0;
		
		while(i<n1 && j<n2)
		{
			if(temp1[i]<temp2[j])
			{
				ar[k]=temp1[i];
				i++;
				
			}
			else
			{
				ar[k]=temp2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			ar[k]=temp1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			ar[k]=temp2[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] ar,int start,int end)
	{
		if(start<end)
		{
			int middle=(start+end)/2;
			System.out.println("middle: "+middle);
			mergeSort(ar, start, middle);
			mergeSort(ar, middle+1, end);
			
			merge(ar, start, middle, end);
		}
	}
	
	// O(n2) algo
	// can be used to sort linked list
	public static int[] insertionSort(int[] ar)
	{
		for(int i=1;i<ar.length;i++)
		{
			int k=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>k) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=k;
		}
		
		return ar;
	}
	
	public static int[] selectionSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[minIndex])
					minIndex=j;
			}
			//System.out.println(minIndex);
			int a=ar[i];
			ar[i]=ar[minIndex];
			ar[minIndex]=a;
		}
		return ar;
	}
	
	public static int[] bubbleSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++) {
			int j=0;
			while(j<ar.length) {
				if(ar[j]>ar[i])
				{
					int a=ar[i];
					ar[i]=ar[j];
					ar[j]=a;
				}
				j++;
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a=bubbleSort(new int[] {0,5,4,3,2,1});
		
		int[] a={0,5,4,3,2,1};
		mergeSort(a, 0, a.length-1);
		for(int i : a)
			System.out.println(i+" ");
	}

}
