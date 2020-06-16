package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class EvenMatrix {

	/*
As usual, Tom and Jerry are fighting. Tom has strength TS and Jerry has strength JS. You are given TS and your task is to find the number of possible values of JS such that Jerry wins the following game.

The game consists of one or more turns. In each turn:

If both TS and JS are even, their values get divided by 2 and the game proceeds with the next turn.
If both TS and JS are odd, a tie is declared and the game ends.
If TS is even and JS is odd, Tom wins the game.
If TS is odd and JS is even, Jerry wins the game.
Find the number of possible initial values of JS such that 1≤JS≤TS, there is no tie and Jerry wins the game.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer TS.
Output
For each test case, print a single line containing one integer ― the number of values of JS such that Jerry wins the game.

Constraints
1≤T≤105
1≤TS≤1018
Subtasks
Subtask #1 (20 points): T,TS≤100
Subtask #2 (80 points): original constraints

Example Input
2
1
11
Example Output
0
5
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s;		
		while ((s=r.readLine())!=null) {
			int t = Integer.parseInt(s);
			for (int i = 0; i < t; i++) {
				int odd = 1;
				int even = 2;
				StringBuilder sb = new StringBuilder();

				int n = Integer.parseInt(r.readLine());
				for (int j = 0; j < n; j++) {
					if(j%2==0) {
						for (int k = 0; k < n; k++) {
							if(k%2==0) {
								sb.append(odd+" ");
								odd = odd+2;
							}
							else{
								sb.append(even+" ");
								even = even+2;
							}

						}
					}
					else {
						for (int k = 0; k < n; k++) {
							if(k%2==0) {
								sb.append(even+" ");
								even = even+2;
							}
							else{
								sb.append(odd+" ");
								odd = odd+2;
							}

						}
					}
					sb.append("\n");
				}
				sb.setLength(sb.length() - 1);
				System.out.println(sb.toString());
			}

			
		}
	}

}

