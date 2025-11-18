/* Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"        Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:
Input: s = "bbbbb"           Output: 1
Explanation: The answer is "b", with the length of 1. */

import java.util.HashSet;

public class NonRepeatedLongestSubstring {
  public int lengthOfLongestSubstring(String s){
    HashSet<Character> hs=new HashSet<>();
        int left=0,right=0,maxLen=0;
        while(right<s.length())
        {
            if(!hs.contains(s.charAt(right)))
            {
                hs.add(s.charAt(right));
                right++;
                maxLen=Math.max(hs.size(),maxLen);
            }
            else
            {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
}
}
