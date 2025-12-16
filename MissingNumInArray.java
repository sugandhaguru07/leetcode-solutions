/* Find the missing number in an array.
If array={1,2,4,5} then output will be 3 */
public class MissingNumInArray{
    public static int findMissingNum(int[] arr)
    {
        int n=arr.length+1;
        int xor1=0, xor2=0;
        for(int i=1;i<=n;i++)
        {
            xor1^=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            xor2^=arr[i];
        }
        return xor1^xor2;
    }
}

/* XOR rules are: 0 0 -> 0, 1 1 -> 0, 1 0 -> 1, 0 1 -> 1 
So if the array is {3,1,4,6,5} then 
1. we will do xor of full range. Here range is 1(smallest num) to 6(largest num).
And array length is 5 ,not 6 as one number is missing. So we will perform xor from 1 to n+1(5+1)
using loop.
2. we will perform xor of all elements present in the array.
3. so from the 1st step ->  1,2,3,4,5,6 ; and 2nd step -> 1,3,4,5,6,
and if we do xor of 1st and 2nd step results then:
1 1 -> 0
2 * -> 2
3 3 -> 0
4 4 -> 0
5 5 -> 0
6 6 -> 0
So only 2 will be returned.
*/