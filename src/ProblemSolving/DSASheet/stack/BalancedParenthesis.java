package ProblemSolving.DSASheet.stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "{()[()]{";
        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

       for(char c: s.toCharArray()){
           if(c == '{' || c == '[' || c == '(') {
               stack.push(c);
           }else {
               if (stack.isEmpty()) {
                   return false;
               }
               if ((c == '}' && stack.peek() != '{') || (c == ']' && stack.peek() != '[') || (c == ')' && stack.peek() != '(')){
                   return false;
               }else{
                   stack.pop();
               }
           }
       }
       return true;
    }
}
