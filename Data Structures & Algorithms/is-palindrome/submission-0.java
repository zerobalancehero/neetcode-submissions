class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder s1=new StringBuilder(s);
        if(s1.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }
}
