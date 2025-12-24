/* An array is  given in increasing order. We have return an array which will contain square of
each elements and the resultant array must be increasing order.
*/
public class SquareOfArray {
    public static int[] squareOfArrayElements(int[] arr)
    {
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        int head=0,tail=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[head]>arr[tail])
            {
                result[i]=arr[head];
                head++;
            }
            else{
               result[i]=arr[tail];
                tail--; 
            }
        }
        return result;
    }
}

/* If the given array doesn't contain any negative number there is no complexity
in the problem , for example: arr[]={1,2,3,4} then result array will be {1,4,9,16} and the
resultant array is in increasing order. But if the array is {-4,-1,0,3,10}, then the resultant
array={16,1,0,9,100} and the elements of the resultant array are not sorted.
So we have used two pointers head and tail in the code which will help to sort the 
array. Two pointers approach is efficient and time complexitiy is O(n) as we iterate
the entire array only once.
1. Atfirst we calculate the square of each element present in the given array.
2.Then we create a new array with same size as given array to store the sqaure elements.
3. Given array= {-4,-1,0,3,10}
After calculation of square of elements, array is={16,1,0,9,100}. 
initially head=arr[0] means 16 and tail=arr[4] means 100.
Now we will compare head and tail : as here tail(100) is greater than head(16) so we fill the
last element place in new array with tail and will decrement the tail by 1. So array={16(head),1,0,9(tail),100}
Current new array={ , , , ,100}.
array={16(head),1,0,9(tail),100} -> as head greater than tail so las 2nd place of new array will be
be filled with the value of head and head will be incremented by 1.
In this way resultant new array will be filled with values by using two pointers in 
the given array.
At the end resultant array will be returned {0,1,9,16,100}.
*/
