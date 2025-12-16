import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrNum {
    public static int[] smallerNumbers(int[] arr)
    {
        int[] copy=arr.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[arr.length];
        for(int i=0;i<copy.length;i++)
        {
           map.putIfAbsent(copy[i],i);
        }
        for(int i=0;i<arr.length;i++)
        {
            result[i]=map.get(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,2,5};
        System.out.println(Arrays.toString(smallerNumbers(arr)));
    }
}

/* If given array is {2,1,3,2,5}, then the resultant array will be {1,0,3,1,4}
as number of smaller elements than 2 is 1, than 1 is 0, ...,than 5 is 4 in the given array.
Working way:
atfirst we copy the elements of given array into a new array and sort them.
For ex: Sorted array for given array will be-{1,2,2,3,5} 
If we observe carefully, number of smaller numbers than current elements in the given array 
is the indices of the elements in the sorted array, for example:
the sorted array is {1,2,2,3,5} and index of 1 is 0 so no. of smaller numbers than 1 in 
the given array is 0. Same for other elements too like for 2 it will be 1,for 3 it will be
3(index of 3), and for 5 it will be 4. 
But there  is one more thing, the array may have duplicate elements, here it is 2.
So in the sorted array we can see that the index of first 2(which is 1) is the right ans, but
there is another 2 and its index is 2 which will not be taken as output. 
So to do that we will use a hashmap which will store the elements of the sorted array only if it is not
already in the map( that's why putIfAbsent() method is used here) and its index number.
For example: atfirst map will store 2 and its index number, but when 2 will be encountered again
map will not store it and will skip it.
At the end a new array is created and the keys from the map will be retrieved andstored in the new array.
The new array will be returned as a result.

*/