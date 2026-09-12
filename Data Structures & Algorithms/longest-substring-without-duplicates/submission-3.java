class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        if(s==null||s.equals(""))return 0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(set.add(s.charAt(j))){
                    count++;
                     max=Math.max(count,max);
                }
                else{
                   
                    set.clear();
                    break;
                }
            }
        }
        return max;
    }
}
