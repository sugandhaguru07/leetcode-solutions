/* Find the length of longest substring with no repeatation of characters in the given string  */

import java.util.HashMap;

public class SlidingWindow {
    public static int longestSubstring(String str){
        int l=0, max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<str.length();r++)
        {
             char c=str.charAt(r);
             if(map.containsKey(c) && map.get(c)>=l)
             {
                l=map.get(c)+1;
             }
            map.put(c,r);
            max=Math.max(max,r-l+1); 
        }
        return max;  
    }
}
/* Explantion: 
   We keep a sliding window that represents the current substring without repeating characters.
   Here l is the left index of the current window, max stores the length of the longest valid window
   seen so far. Hashmap is used to store the last index where each character was seen.
   r is the right index of the window. We extend the window one character at a time.
   At every step we maintain a window with unique characters. When a repeat is found,
    moving l to map.get(c)+1 is the least movement that restores uniqueness while preserving 
    the maximal possible window that ends at r. Because l never moves back, and every time we 
    either extend the window or move l forward to remove the duplicate, we consider every
   candidate substring exactly once — hence correctness.
*/

