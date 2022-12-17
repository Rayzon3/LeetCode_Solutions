import java.util.Stack;

public class evaluateReversePolishNotation {

    static Stack<Integer> myStack = new Stack<>();
    public static int evalRPN(String[] tokens) {
        for(int i = 0; i < tokens.length; i++) {
           if(tokens[i] == "+") {
                int x = myStack.pop();
                int y = myStack.pop();
                myStack.push(x + y);
           }
           else if(tokens[i] == "*") {
                int x = myStack.pop();
                int y = myStack.pop();
                myStack.push(x * y); 
           }
           else if(tokens[i] == "-") {
                int x = myStack.pop();
                int y = myStack.pop();
                myStack.push(y - x);
           }    
           else if(tokens[i] == "/") {
            int x = myStack.pop();
            int y = myStack.pop();
            myStack.push(y / x);
           }
           else {
            myStack.push(Integer.parseInt(tokens[i]));
           }
           
        }

        return myStack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = { "4","13","5","/","+" };
        System.out.println(evalRPN(tokens));
    }
}
