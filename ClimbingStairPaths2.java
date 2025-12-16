/* You are climbing a staircase. It takes n steps to reach the top. Each time you can climb either
1 step,2 steps or 3 steps. Return all the distinct ways for climbing to the top */
import java.util.ArrayList;

public class ClimbingStairPaths2 {
    public static ArrayList<String> pathsReturn(int n)
    {
        if(n==0) {
           ArrayList<String> arr=new ArrayList<>();
           arr.add("");
           return arr;
        } 
        if(n<0)
        {
            return new ArrayList<>();
        }
        ArrayList<String> a1=pathsReturn(n-1);
        ArrayList<String> a2=pathsReturn(n-2);
        ArrayList<String> a3=pathsReturn(n-3);
        ArrayList<String> allPaths=new ArrayList<>();
        for(String path:a1)
        {
            allPaths.add(1+path);
        }
        for(String path:a2)
        {
            allPaths.add(2+path);
        }
        for(String path:a3)
        {
            allPaths.add(3+path);
        }
        return allPaths;
    }
    public static void main(String[] args) {
        ArrayList<String> result=pathsReturn(5);
        System.out.println(result);
    }
}
