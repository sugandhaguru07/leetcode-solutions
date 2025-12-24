import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSumArray(int[] arr)
    {
        if(arr==null || arr.length<3) 
            return new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<n-2;i++)
        {
           int left=i+1;
           int right=n-1;
           while(left<right){
             int sum=arr[i]+arr[left]+arr[right];
             if(sum==0)
             {
                result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                left++;
                right--;
             }
             else if(sum<0)
             {
                left++;
             }
             else
             {
                right--;
             }
           }
        }
         return new ArrayList<>(result);
    }
}



/*  left and right belong to the current i only.
Every time we fix a new first element (i), we start a fresh two-pointer search.
Code Proof:
for (int i = 0; i < nums.length - 2; i++) {
    int left = i + 1;
    int right = nums.length - 1;
    while (left < right) {
        ...
    }
}
left and right are declared inside the for loop, So for every new i, they are re-initialized

Here HashSet is used to store the result as a HashSet only stores unique elements,so if we get
similar type of triplets then hshset will choose only one,not both.

Working way:

SORT
FOR each i
    IF duplicate → skip
    left = i + 1
    right = n - 1

    WHILE left < right
        sum = nums[i] + nums[left] + nums[right]

        IF sum == 0
            save triplet
            left++
            right--
            skip duplicates

        ELSE IF sum < 0
            left++

        ELSE
            right--



*/