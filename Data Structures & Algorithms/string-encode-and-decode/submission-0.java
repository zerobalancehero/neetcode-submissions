class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append((s.length())).append('#').append(s);
        }
        return sb.toString();
        }

    public List<String> decode(String str) {
        List<String> s=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            String st=str.substring(j+1,length+j+1);
            s.add(st);
            i=j+length+1;
        }
        return s;
    }
}
