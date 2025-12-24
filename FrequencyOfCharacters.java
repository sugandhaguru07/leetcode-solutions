/*Find the number of occurence/frequency of each characters in a String */

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="abbcacacbb";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}


