import java.util.ArrayList;
import java.util.List;

public class DisappearedNumsInArray {
    public static List<Integer> findDisappearedElements(int[] arr)
    {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int index=Math.abs(arr[i])-1;
            if(arr[index]>0)
            {
               arr[index]=-arr[index];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                result.add(i+1);
            }
        }
        return result;
    }
}

/* Working way:
 arr={3,1,4,3,1,6} 
 1st for loop:
i=0(element 3) => index=3-1=2, Now find the 2nd indexed element in the array and 
it is 4. Mark it negative so it will be -4. So now arr={3,1,-4,3,1,6}

i=1(element 1) => index=1-1=0, Now find the 0th indexed element in the array and 
it is 3. Mark it negative so it will be -3. .So now arr={-3,1,-4,3,1,6}

i=2(element 4) => index=4-1=3, Now find the 3rd indexed element in the array and 
it is 3. Mark it negative so it will be -3. So now arr={-3,1,-4,-3,1,6}

i=3(element 3) => index=3-1=2, Now find the 2nd indexed element in the array and 
it is 4. which is already marked as negative so leave as it is. 

i=4(element 1) => index=1-1=0, Now find the 0th indexed element in the array and 
it is 3 which is already marked as negative so leave as it is.

 i=5(element 6) => index=6-1=5, Now find the 5th indexed element in the array and 
it is 6. Mark it negative so it will be -6. So now arr={-3,1,-4,-3,1,-6}

2nd loop:
Here we will check which indexes of the array has positive element and the ans is 
1,4. Now add 1 with both of them and it will be 1+1=2,4+1=5. Add 2 nad 5 in the arraylist.
Atlast return the arraylist.

*/