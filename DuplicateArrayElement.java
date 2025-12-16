import java.util.HashMap;
import java.util.Map;

public class DuplicateArrayElement
{
    public static void findDuplicate(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0) +1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet() )
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={2,1,4,2,1};
        findDuplicate(arr);
    }
}

/* Time nad space comp. - O(n) 
Here HashMap is used to store array element and its count value. 
In the first loop:  we put array element and total number of its appearance in the array. 
And we count the elements by using map.getOrDefault() method.
getOrDefault() works like this-it takes two parameter, one is key and another is default value.
It returns the value of the key if it exists,otherwise will return the default value.
For example: int[] arr={2,1,4,2,1}, for 1st element 2 getOrDefault(2,0)+1 will return  the given default value 0(0+1=1) as 2 doesn't exist in the map.
So for 2 map is-(2,1). Now while encountering 2 for the 2nd time getOrDefault(2,0) will find that 2 exists in map so it will return its value which is 1 and will be added by 1.
So now map is (2,2) means 2 appears 2 times in the array. 
map.put() is used to add key value in the map.
In the 2nd loop:  for(Map.Entry<Integer,Integer> entry: map.entrySet() )
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
A Map.Entry represents one key-value pair in the map.
map.entrySet() converts the map into a set of key-value pairs.
So here basically we are chekcing that a key in the map has value more than 1 or not.
If yes then the key is presented as a duplicate element.
*/