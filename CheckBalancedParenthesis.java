import java.util.Stack;
 
public class CheckBalancedParenthesis {
 /*
  *Whenever you encounter current character as ( or { or [, push it into the stack.
   Whenever you encounter current character as ) or } or ], retrieve last element from stack and check if current character is in pair with last character retrieved from stack and if it is not in pair then expression is not balanced.
If we have empty stack in the end, it is balanced parentheses, else it is not balanced parentheses.
  */
 public static void main(String[] args) {
 String checkBalancedExpr1=checkBalancedParentesis("a*(b+c)-(d*e)");
 System.out.println("a*(b+c)-(d*e) : "+checkBalancedExpr1);
 String checkBalancedExpr2=checkBalancedParentesis("(a*(b-c)*{d+e}");
 System.out.println("(a*(b-c)*{d+e} : "+checkBalancedExpr2);
 }
 public static String checkBalancedParentesis(String expr)
 {
 if (expr.isEmpty())
 return "Balanced";
 
 Stack<Character> stack = new Stack<Character>();
 for (int i = 0; i < expr.length(); i++)
 {
 char current = expr.charAt(i);
 if (current == '{' || current == '(' || current == '[')
 {
 stack.push(current);
 }
 if (current == '}' || current == ')' || current == ']')
 {
 if (stack.isEmpty())
 return "Not Balanced";
 char last = stack.peek();
 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
 stack.pop();
 else 
 return "Not Balanced";
 }
 }
 return stack.isEmpty()?"Balanced":"Not Balanced";
 }
 
}
 