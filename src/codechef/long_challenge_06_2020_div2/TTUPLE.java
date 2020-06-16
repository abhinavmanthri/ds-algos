package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TTUPLE {
	/*
	 Operations on a Tuple Problem Code: TTUPLE
Add problem to Todo list
Submit


Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
Consider the following operations on a triple of integers. In one operation, you should:

Choose an integer d and an arithmetic operation ― either addition or multiplication.
Choose a subset of elements of the triple.
Apply the arithmetic operation to each of the chosen elements, i.e. either add d to each of them or multiply each of them by d.
For example, if we have a triple (3,5,7), we may choose to add 3 to the first and third element, and we get (6,5,10) using one operation.

You are given an initial triple (p,q,r) and a target triple (a,b,c). Find the minimum number of operations needed to transform (p,q,r) into (a,b,c).

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers p, q and r.
The second line contains three space-separated integers a, b and c.
Output
For each test case, print a single line containing one integer ― the minimum required number of operations.

Constraints
1≤T≤1,000
|p|,|q|,|r|,|a|,|b|,|c|≤109
Subtasks
Subtask #1 (10 points): |p|,|q|,|r|,|a|,|b|,|c|≤10
Subtask #2 (90 points): original constraints

Example Input
2
3 5 7
6 5 10
8 6 3
9 7 8
Example Output
1
2
Explanation
Example case 1: We add 3 to the first and third element of (3,5,7) to form (6,5,10).

Example case 2: We can add 1 to each element to form (9,7,4) and then multiply the third element by 2.
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		String s;		
		try {
			while ((s=reader.readLine())!=null) {
				int t = Integer.parseInt(s);
				for (int i = 0; i < t; i++) {

					// starts here
					if ((s=reader.readLine())!=null) {
						String[] pqr = s.trim().split(" ");
						long p = Long.parseLong(pqr[0]);
						long q = Long.parseLong(pqr[1]);
						long r = Long.parseLong(pqr[2]);
						String[] abc = reader.readLine().trim().split(" ");
						long a = Long.parseLong(abc[0]);
						long b = Long.parseLong(abc[1]);
						long c = Long.parseLong(abc[2]);

						if(p==a && q==b && r==c) {
							System.out.println(0);
							continue;
						}
						long diff1 = a-p;
						long diff2 = b-q;
						long diff3 = c-r;
						if ((diff1 == diff2 && diff2==diff3) || (diff1==0 && diff2==diff3) || (diff2==0 && diff3==0) || (diff3==0 && diff1==0) 
								|| (diff1==0 && diff2==diff3) || (diff2==0 && diff1==diff3) || (diff3==0 && diff1==diff2)) {
							System.out.println(1);
							continue;
						}
						try {
							if(((a-b)%(p-q)==0) || ((b-c)%(q-r)==0) || ((c-1)%(r-p)==0) )
							{
								System.out.println(2);
								continue;
							}
							
						} catch (Throwable e) {		
							System.out.println(2);
						}

						System.out.println(3);			
						// ends here
					}
				}			
			}
		} catch (Throwable e) {
			throw new Exception(e);
		} 
	}

}
