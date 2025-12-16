/* Find the two elements in an array which will give the target element by adding them. The output will be an array of indices of the numbers. */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOfArray {
     public static int[] twoSum(int[] arr,int tgt)
     {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int ele=tgt-arr[i];
            if(map.containsKey(ele))
            {
                return new int[]{map.get(ele),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
     }
     public static void main(String[] args) {
        int[] arr={10,20,25,40};
        int target=45;
        System.out.println(Arrays.toString(TwoSumOfArray.twoSum(arr, target)));
     }
}
