/* Given two integers n and m, calculate:
sum1- sum of all numbers between 1 to m that are not divisible by n
sum2- sum of numbers between 1 to m that are divisible by n
Return sum1 - sum2
*/

public class DifferenceOfSums{
    public static int differenceOfSums(int n, int m)
    {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++)
        {
           if(i%n!=0)   
           {
             sum1=sum1+i;
           }
           else
           {
            sum2=sum2+i;
           }
        }
        return sum1-sum2;
    }
}