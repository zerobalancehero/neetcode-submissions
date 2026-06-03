class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              HashMap<String,List<String>> map=new HashMap<>();
              for(int i=0;i<strs.length;i++){
                char []A=strs[i].toCharArray();
                Arrays.sort(A);
                String sorted=new String(A);
                map.putIfAbsent(sorted,new ArrayList<>());
                map.get(sorted).add(strs[i]);
              }
              return new ArrayList<>(map.values());
    }
}
