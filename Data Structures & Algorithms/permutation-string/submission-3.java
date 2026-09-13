class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int freqs1[]=new int[26];
        int freqs2[]=new int[26];
       for(char ch:s1.toCharArray()){
        freqs1[ch-'a']++;
       }
       int k=s1.length();
       for(int i=0;i<k;i++){
        char ch=s2.charAt(i);
        freqs2[ch-'a']++;
       }
       if(matches(freqs1,freqs2))return true;
       for(int i=k;i<s2.length();i++){
        freqs2[s2.charAt(i)-'a']++;
        freqs2[s2.charAt(i-k)-'a']--;
        if(matches(freqs1,freqs2))return true;
       }
       return  false;
       
    }
    public boolean matches(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
}
