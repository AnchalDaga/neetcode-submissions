class MinStack {

    Stack <Integer> stack = new Stack<Integer>();
    Stack <Integer> stackMin = new Stack<Integer>();
    public MinStack() {
        
    }
    public void push(int val) {
        stack.push(val);
        if (stackMin.isEmpty()) {
            stackMin.push(val);
        } else {
            int currentMin = stackMin.peek();
            stackMin.push(Math.min(val, currentMin));
        }        
    }
    
    public void pop() {
        stackMin.pop();
        stack.pop();
        
    }
    
    public int top() {
        int topper = stack.peek();
        return topper;
    }
    
    public int getMin() {
        return stackMin.peek();
        
    }
}
