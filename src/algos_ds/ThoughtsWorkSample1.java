package algos_ds;

import java.util.ArrayList;
import java.util.Collections;

public class ThoughtsWorkSample1 {
	 public static int nextPrime(int start) 
	    { 
	        // start with next number. 
	        int next = start + 1; 
	  
	        // breaks after finding next prime number 
	        while (!isPrime(next)) 
	            next++; 
	  
	        return next; 
	    } 
	 public static int previousPrime(int start) 
	    { 
	        // start with next number. 
	        int next = start - 1; 
	  
	        // breaks after finding next prime number 
	        while (!isPrime(next)) 
	            next--; 
	  
	        return next; 
	    } 
	 public static boolean isPrime(int n) 
	    { 
		 if(n==2)
			 return true;
	        // check if n is a multiple of 2 
	        if (n % 2 == 0) 
	            return false; 
	  
	        // if not, then just check the odds 
	        for (int i = 3; i * i <= n; i += 2) 
	            if (n % i == 0) 
	                return false; 
	        return true; 
	    } 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {20};
		int k=1	;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i:a)
		{
			System.out.println(i);
			if(i==1)
			{
				al.add(3);
				continue;
			}
			int temp=(int) Math.sqrt(i);
			System.out.println("found sqrt: "+temp);
			if(isPrime(temp) && temp>1)
			{
				System.out.println("found prime: "+temp);
				if(temp*temp==i)
				{
					al.add(0);
				}
				else
				{		
					
						al.add(Math.min((temp+1)*(temp+1)-i,i-temp*temp ));
				}
			}
			else
			{
				int next=nextPrime(temp);
				int prev=previousPrime(temp);
				System.out.println("next prime: "+next+" previous prime: "+prev);
				
				if(Math.min((next*next)-i,i-prev*prev )>1)
						al.add(Math.min((next*next)-i,i-prev*prev ));
				else
				{
					System.out.println("closer prime: "+next);
					al.add((next*next)-i);
				}
			}
			
			
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println("after sort: "+al);
		int temp=0;
		int res=0;
		for(Integer i:al)
		{
			temp++;	
			if(i!=0)
			{
				res=res+i;
			}
			
			if(temp==k)
			{
				break;
			}
		}
		System.out.println("before: "+res);
		res=res+(al.size()-temp);
		
		System.out.println("result: "+res);
		
		System.out.println(isPrime(2));
		
		

	}

}
