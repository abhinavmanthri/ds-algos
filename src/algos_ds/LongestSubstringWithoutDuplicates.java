package algos_ds;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	            	System.out.println("adding: "+s.charAt(j));
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	            	System.out.println("removing: "+s.charAt(i));
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcaa"));

	}

}
