class MinStack {
    int min;
    int data;
    MinStack next;
    MinStack top;
    public MinStack(int data,int min) {
        
            this.data=data;
            this.min=min;
            this.next=null;
        
    }
    
      public MinStack() {
        top = null;
    }

    public void push(int val) {
        if(top==null)top=new MinStack(val,val);
        else{
            int newMin=Math.min(val,top.min);
            MinStack newNode=new MinStack(val,newMin);
            newNode.next=top;
            top=newNode;
        }
    }
    
    public void pop() {
        if(top==null){
            throw new RuntimeException("Stack UnderFlow");
        }
        else{
            top=top.next;
        }
    }
    
    public int top() {
        if(top==null){
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }
    
    public int getMin() {
        if(top==null)throw new RuntimeException("Stack is empty");
        return top.min;
    }

}
