class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ga=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
                map.get(sorted).add(str);
            }else{
                map.get(sorted).add(str);
            }
        }
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            ga.add(entry.getValue());
        }
        return ga;
    }
}
