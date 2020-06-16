package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class ChefAndIcecream {

	/*
Chef owns an icecream shop in Chefland named scoORZ. There are only three types of coins in Chefland: Rs. 5, Rs. 10 and Rs. 15. An icecream costs Rs. 5.

There are N people (numbered 1 through N) standing in a queue to buy icecream from scoORZ. Each person wants to buy exactly one icecream. For each valid i, the i-th person has one coin with value ai. It is only possible for someone to buy an icecream when Chef can give them back their change exactly ― for example, if someone pays with a Rs. 10 coin, Chef needs to have a Rs. 5 coin that he gives to this person as change.

Initially, Chef has no money. He wants to know if he can sell icecream to everyone in the queue, in the given order. Since he is busy eating his own icecream, can you tell him if he can serve all these people?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers a1,a2,…,aN.
Output
For each test case, print a single line containing the string "YES" if all people can be served or "NO" otherwise (without quotes).

Constraints
1≤T≤100
1≤N≤103
ai∈{5,10,15} for each valid i
Subtasks
Subtask #1 (40 points): ai∈{5,10} for each valid i
Subtask #2 (60 points): original constraints

Example Input
3
2
5 10
2
10 5
2
5 15
Example Output
YES
NO
NO
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s;		
		while ((s=r.readLine())!=null) {

			int t = Integer.parseInt(s);
			for (int i = 0; i < t; i++) {
				r.readLine();
				int[] ar =Arrays.stream(r.readLine().split(" "))
						.mapToInt(Integer :: parseInt).toArray();

				HashMap<Integer, Integer> map = new HashMap<>();
				map.put(5, 0);
				map.put(10, 0);
				map.put(15, 0);

				boolean flag = true;

				for (int j = 0; j < ar.length; j++) {
					if(ar[j]==5) {
						map.put(5, map.get(5)+1);
						continue;
					}
					else if (ar[j]==10) {
						if(map.get(5)>0) {
							map.put(5, map.get(5)-1);
							map.put(10, map.get(10)+1);
							continue;
						}
						flag = false;
						break;
					}
					else {

						if(map.get(10)>0) {
							map.put(10, map.get(10)-1);
							map.put(15, map.get(15)+1);
							continue;
						}
						else if(map.get(5)>=2) {
							map.put(5, map.get(5)-2);
							map.put(15, map.get(15)+1);
							continue;
						}
						flag = false;
						break;


					}
				}
				if (flag) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}

	}

}
