class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String n:operations){
            switch(n){
                case "+":
                int temp=s.pop();
                int temp2=s.peek();
                s.push(temp);
                s.push(temp2+temp);
                break;
                case "D":
                s.push(s.peek()*2);
                break;
                case "C":
                s.pop();
                break;
                default:
                s.push(Integer.valueOf(n));
            }
        }
        int sum=0;
        for(int score:s){
            sum+=score;
        }
        return sum;
    }
}