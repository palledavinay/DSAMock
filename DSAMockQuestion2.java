package in.ineuron.main;

import java.util.HashMap;
import java.util.Map;
 class Solution1 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charFrequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
public class DSAMockQuestion2 {

	public static void main(String[] args) {
		 String s1 = "leetcode";
	        Solution1 solution = new Solution1();
	        System.out.println(solution.firstUniqChar(s1));
	        String s2 = "loveleetcode";
	        System.out.println(solution.firstUniqChar(s2));
	        String s3 = "aabb";
	        System.out.println(solution.firstUniqChar(s3));
	        
		
	}

}
