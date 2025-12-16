/*We are given a string that contains only parenthesis characters like (,),{,},[,]. Our task is to check the string is valid or not by checking the brackets. */

import java.util.Stack;

public class ValidParenthesis {
    public static boolean stringValidity(String str)
    {
        Stack<Character> st=new Stack<>();
        for(char i:str.toCharArray())
        {
             if(i=='(' ||i=='{' || i=='[')
             {
                  st.push(i);
             }
             else{
                if(st.empty())
                {
                    return false;
                }
                char ch=st.pop();
                    if ((ch == '(' && i != ')') ||
                    (ch == '{' && i != '}') ||
                    (ch == '[' && i != ']')) {
                    return false;
                }
             }
    }
       return st.empty();
}
    public static void main(String[] args) {
        String str="({[]})";
        System.out.println(stringValidity(str));
    }
}

/*  A string is valid when: every opening bracket has a matching closing bracket, brackets close in the correct order, no umnmatched brackets.
Here we are pushing opening brackets in a character stack ,and checks that if closing brackets present in the string are not matched with opening brackets on the top,then the string is not valid*/ 

