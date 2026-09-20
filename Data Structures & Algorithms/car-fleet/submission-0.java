class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack=new Stack<>();
        Integer order[]=new Integer[position.length];
        for(int i=0;i<position.length;i++){
            order[i]=i;
        }
         Arrays.sort(order, (a, b) -> Integer.compare(position[b], position[a]));
        for(int index:order){
            Double time=(double)(target-position[index])/speed[index];
            if(stack.isEmpty()||time>stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
