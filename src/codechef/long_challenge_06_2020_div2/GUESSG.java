package codechef.long_challenge_06_2020_div2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GUESSG {

	/*

	Guessing Game Problem Code: GUESSG
Add problem to Todo list
Submit


Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
This is an interactive problem. Incase you are new to interactive problems, take a look at this link.

Alice and Bob are playing a game. Initially, Alice has a hidden integer x; Bob only knows an integer N such that 1≤x≤N and he has to find x by asking questions. In each question, Bob must choose an integer y (1≤y≤N), and Alice answers 'G', 'L' or 'E' based on whether x>y, x<y or x=y respectively.

However, to make things more interesting, they decided that Alice can lie sometimes. In particular, she cannot lie two times in a row and when x=y (i.e. Bob found x), she has to answer 'E', so lying corresponds to answering 'G' when the correct answer is 'L' or vice versa. Alice can choose to lie at any time as long as she follows these rules.

As soon as Alice answers 'E' to some question, the game ends and Bob wins. Help Bob and win the game using no more than K questions.

Note: The grader is adaptive ― the answer is not fixed at the start, but the answers to your questions are chosen in such a way that there is always at least one integer x which is consistent with all answers (for some valid choice of answers that are lies).

Interaction
First, you should read a line containing a single integer N.
Then, you should ask questions. To ask a question, print a line containing a single integer y. Then, you must read a line containing a single character: 'G', 'L' or 'E', denoting the answer to your question.
As soon as the answer to one of your questions is 'E', you must terminate your program.
Constraints
1≤N≤109
Subtasks
Subtask #1 (15 points):

K=300
Alice follows a simpler strategy: she either answers the second, fourth, sixth, etc. question or the first, third, fifth, etc. question truthfully, but she may or may not lie in all other questions
Subtask #2 (30 points):

K=300
N≤100,000
Subtask #3 (30 points): K=300
Subtask #4 (25 points): K=120
Example
Grader              You
5
                    2
L
                    4
G
                    4
G
                    5
E
Explanation
The hidden number is x=5. Alice decides to lie in the first question, so she has to tell the truth in the second question. In the third question, she decides to tell the truth, and in the final question, she answers 'E', since Bob asks about the correct value.
	 */
	public static void main(String[] args) throws Exception {
		// 
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		String s;				
		while ((s=reader.readLine())!=null) {
			long N = Long.parseLong(s);							
			//start		
			long l = 1;
			long r = N;
			
			long mid;
			while (true) {
				System.out.println(l);
				String replyString = reader.readLine();
				if("E".equals(replyString)) {
					System.exit(0);
					
				}
				else if("G".equals(replyString)){
					l++;
					mid = l + (r - l) / 2;
					System.out.println(mid);
					replyString = reader.readLine();
					if("E".equalsIgnoreCase(replyString)) {
						System.exit(0);					
					}
					System.out.println(mid);
					String reply2 = reader.readLine();
					
					if ("G".equals(replyString) && "G".equals(reply2)) {
						l = mid+1;
					}
					else if ("L".equals(replyString) && "L".equals(reply2)) {
						r = mid-1;
					}
					
				}
				else {
					l++;
					mid = l + (r - l) / 2;
					System.out.println(mid);
					replyString = reader.readLine();
					if("E".equalsIgnoreCase(replyString)) {
						System.exit(0);					
					}
					else if("G".equalsIgnoreCase(replyString)){
						l = mid+1;
					}
					else {
						
						r = mid-1;
					}					
				}	
			}
			// end					
		}				
	}

}
