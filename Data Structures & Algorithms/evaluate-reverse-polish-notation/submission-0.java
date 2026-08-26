class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(switch (token) {
                        case "+" -> num1 + num2;
                        case "-" -> num1 - num2;
                        case "*" -> num1 * num2;
                        case "/" -> num1 / num2;
                        default -> 0;
                    });
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}