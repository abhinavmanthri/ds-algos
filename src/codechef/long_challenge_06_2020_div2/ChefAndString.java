package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChefAndString {
	/*
	 * There are N students standing in a row and numbered 1 through N from left to right. You are given a string S with length N, where for each valid i, the i-th character of S is 'x' if the i-th student is a girl or 'y' if this student is a boy. Students standing next to each other in the row are friends.

The students are asked to form pairs for a dance competition. Each pair must consist of a boy and a girl. Two students can only form a pair if they are friends. Each student can only be part of at most one pair. What is the maximum number of pairs that can be formed?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single string S.
Output
For each test case, print a single line containing one integer ― the maximum number of pairs.

Constraints
1≤T≤100
1≤N≤105
|S|=N
S contains only characters 'x' and 'y'
the sum of N over all test cases does not exceed 3⋅105
Subtasks
Subtask #1 (100 points): original constraints

Example Input
3
xy
xyxxy
yy
Example Output
1
2
0
	 */

	public static void main(String[] args) {

		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s;
		try {

			while ((s=r.readLine())!=null) {

				int t = Integer.parseInt(s);
				for (int i = 0; i < t; i++) {

					char[] ar = r.readLine().toCharArray();
					int temp = 0;
					
					for (int j = 0; j < ar.length-1; j++) {
						if(ar[j]!=ar[j+1]) {
							j++;
							temp++;
						}
					}
					System.out.println(temp);
					
				}
			}

		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {
				r.close();
			} catch (IOException e) {
			}
		}






	}

}
