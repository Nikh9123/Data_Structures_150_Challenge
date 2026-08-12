class MinStack {
    
    class Pair{
        int min ;
        int val ;

        Pair(int val, int min){
            this.val = val ;
            this.min = min ;
        }
    }

    Stack<Pair>stack = new Stack() ;

    public MinStack() {
        this.stack = new Stack() ;
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
           stack.push(new Pair(val, val)); 
        }
        else{
            int min = stack.peek().min > val ? val : stack.peek().min ;
            stack.push(new Pair(val, min));
        }
    }
    
    public void pop() {
        stack.pop() ;
    }
    
    public int top() {
        return stack.peek().val ;
    }
    
    public int getMin() {
        return stack.peek().min ;
    }
}
