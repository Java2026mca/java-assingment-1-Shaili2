import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        // Split by space (important for multi-digit numbers)
        String[] tokens = exp.split(" ");

        for (String token : tokens) {

            // If number → push to stack
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            }
            // If operator → perform operation
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val1 + val2);
                        break;
                    case "-":
                        stack.push(val1 - val2);
                        break;
                    case "*":
                        stack.push(val1 * val2);
                        break;
                    case "/":
                        stack.push(val1 / val2);
                        break;
                    default:
                        System.out.println("Invalid Operator");
                        return 0;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        // IMPORTANT: space-separated postfix expression
        String expression = "2 3 1 * + 9 -";

        int result = evaluatePostfix(expression);

        System.out.println("Result = " + result);
    }
}
