public class SecondLargestElementInArray {
    public static int secondLargest(int[] arr)
    {
        if(arr.length<2) return -1;
        int largest,secLargest;
        if(arr[0]>arr[1])
        {
            largest=arr[0];
            secLargest=arr[1];
        }
        else if(arr[0]<arr[1])
        {
            largest=arr[1];
            secLargest=arr[0];
        }
        else{                  //If same elements exist in array
            largest=arr[0];
            secLargest=Integer.MIN_VALUE;
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest)
            {
                arr[i]=secLargest;
            }
        }
        if(secLargest==Integer.MIN_VALUE)
        {
            return -1;   
        }
        return secLargest;
    }
}

/* We have an array={10,5,20,8,22,6}
Initially largest element is arr[0]=10 and 2nd largest is 5.
 Then loop from arr[2] to last element : each element will be compared 
             with largest and second largest element , and based on the
             comparison largest and second largest will be updated throughout
             the loop. 
If array has elements with same value then -1 will be returned as no second 
largest element exists. Same if array length is less than 2.
The code will also work if array has negative numbers.
*/