package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class TheTomandJerryGame {

	/*
Chef has an integer N and he wants to generate a matrix M with N rows (numbered 1 through N) and N columns (numbered 1 through N). He thinks that M would be delicious if:

Each element of this matrix is an integer between 1 and N2 inclusive.
All the elements of the matrix are pairwise distinct.
For each square submatrix containing cells in rows r through r+a and in columns c through c+a (inclusive) for some valid integers r, c and a≥0:
Mr,c+Mr+a,c+a is even
Mr,c+a+Mr+a,c is even
Can you help Chef generate a delicious matrix? It can be proved that a solution always exists. If there are multiple solutions, you may find any one.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.
Output
For each test case, print N lines describing a delicious matrix M. For each valid i, the i-th of these lines should contain N space-separated integers Mi,1,Mi,2,…,Mi,N.

Constraints
1≤T≤10
1≤N≤103
the sum of N over all test cases does not exceed 103
Subtasks
Subtask #1 (100 points): original constraints

Example Input
1
2
Example Output
1 2
4 3
Explanation
Example case 1: The matrix M has five square submatrices. Four of them ([1], [2], [4], [3]) have a=0, so they obviously satisfy all conditions. The last square submatrix is the whole matrix M, with r=c=a=1, and we can see that M1,1+M2,2=1+3=4 and M1,2+M2,1=2+4=6 are both even.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s;		
		while ((s=r.readLine())!=null) {

			int t = Integer.parseInt(s);
			for (int i = 0; i < t; i++) {
				
				int n = Integer.parseInt(r.readLine());
				
				if(n==2) {
					System.out.println("1 2");
					System.out.println("4 3");
					continue;
				}
				if (n==3) {
					System.out.println("2 3 1");
					System.out.println("7 4 8");					
					System.out.println("9 5 6");
					continue;
				}
				int x = 0, y = n-1;
				int even = 2;
				int odd = 1;
				int last = n*n;
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						
						if ((j==k || k==y || odd > last) && even<=last) {
							sb.append(even);
							even = even+2;
						}						
						else {
							sb.append(odd);						
							odd = odd+2;
						}						
						if(k!=n-1) {
							sb.append(" ");
						}						
					}
					if(j!=n-1)
						sb.append("\n");
					y--;
				}
				System.out.println(sb.toString());
			}
		}
	}

}
