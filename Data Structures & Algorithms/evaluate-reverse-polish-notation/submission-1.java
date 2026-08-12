class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String op : tokens) {
            if (op.equals("+")) {
                int top = stack.pop();
                int top2 = stack.pop();
                stack.push(top + top2);
            } else if (op.equals("*")) {
                int top = stack.pop();
                int top2 = stack.pop();
                stack.push(top * top2);
            } else if (op.equals("-")) {
                int top = stack.pop();
                int top2 = stack.pop();
                stack.push(top2 - top);
            } else if (op.equals("/")) {
                int top = stack.pop();
                int top2 = stack.pop();
                stack.push(top2 / top);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        return stack.peek();
    }
}