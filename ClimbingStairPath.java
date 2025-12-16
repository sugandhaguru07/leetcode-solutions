/* You are climbing a staircase. It takes n steps to reach the top. Each time you can climb either
1 step,2 steps or 3 steps. How many distinct ways can you climb to the top?
*/
public class ClimbingStairPath {
    public static int numOfPath(int n)
    {
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        int a=1,b=1,c=2;
        for(int i=3;i<=n;i++)
        {
           int d=a+b+c;
           a=b;
           b=c;
           c=d;
        }
        return c;
    }
}
/* If total stairs is 3 then possible paths are paths [1,1,1],[1,2],[2,1],[3], so number of total paths is 4(output).
numOfPath(3) ->
inside the for loop(i=3 to n which is also 3){
 when i=3 -- a=1,b=1,c=2,d=a+b+c=4
 a=b=1
 b=c=2
 c=d=4
}
 c will be returned=4
 numOfPath(5) ->
 inside the for loop(i=3 to n=5)
 {
 i=3  --   a=1,b=1,c=2, then d=4
           a=b=1
           b=c=2
           c=d=4

i=4   --   a=1,b=2,c=4, then d=7
           a=b=2
           b=c=4
           c=d=7

i=5   --  a=2,b=4,c=7, then d=13
           a=b=4
           b=c=7
           c=d=13
 }
           return c=13
*/


/* You are climbing a staircase. It takes n steps to reach the top. Each time you can climb either
1 step or 2 steps. How many distinct ways can you climb to the top?
*/
public static int numOfPaths(int n)
{
    if(n==0 || n==1) return 1;
    if(n==2) return n;
    int a=1, b=2;
    for(int i=3;i<=n;i++)
    {
        int c=a+b;
        a=b;
        b=c;
    }
    return b;
}
/* Variable meaning: a=1 means 1 way to reach step 1, a=2 means 2 ways to reach step 2
and c is the total ways to reach current step.
Then c updates c=a+b and move forward and b-- a=b,b=c
Finally return b as output.
*/


