public class ReverseSentence {
    public static String reverseSentence(String str)
    {
        char[] arr=str.trim().replaceAll("\\s+"," ").toCharArray();
        int n=arr.length;
        reverse(arr,0,n-1);
        int start=0;
        for(int end=0;end<=n;end++)
        {
            if(end==n || arr[end]==' ')
            {
               reverse(arr, start, end-1);
               start=end+1;
            }
        }
        return new String(arr);
    }
    public static void reverse(char[] arr,int left,int right)
    {
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String str="Java is an object oriented programming language";
        System.out.println(reverseSentence(str));
    }
}


 
