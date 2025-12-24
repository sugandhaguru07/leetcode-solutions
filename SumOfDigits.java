/* If num is 1234, then sum of all digits is 10 */

public class SumOfDigits {
    public static int sumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1234;
        int res=sumOfDigits(n);
        System.out.println(res);
    }
}
