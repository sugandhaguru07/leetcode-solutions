/* 
Given an array, 
find second largest number from even positions,
find second smallest from odd positions,
return their sum.
Ex: Input: {3,9,5,2,8,1}  Output: 7  
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sumof2ndLargest2ndSmallest {
    public static int sum(int[] arr)
    {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even); //2,3,4,5,6
        Collections.sort(odd);   
        return even.get(even.size()-2) + odd.get(1);
        
    }
    public static void main(String[] args) {
        int[] arr={3,9,5,2,8,1};
        int res=sum(arr);
        System.out.println(res);
    }
}


/* We created two arraylist even, and odd , and then added even numbers in
even arraylist and odd numbers in odd arraylist. Then we sort them(increasing order by default)
,then added the sum of 2nd largest number and 2nd smallest number .
*/