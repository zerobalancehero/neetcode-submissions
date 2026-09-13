class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxfreq=0;
        int maxcount=0;
        int count=0;
        int left=0;
        int result=0;
        HashMap<Character,Integer> map=new HashMap<>();
       
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(i)));
            
            while(((i-left+1)-maxfreq)>k){
                
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            result=Math.max(i-left+1,result);
        }
        return result;
    }
}
