class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
       map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
      }
     List<Map.Entry<Integer,Integer>> lis=new ArrayList<>(map.entrySet());
     lis.sort((a,b)->b.getValue()-a.getValue());
      int []arr=new int[k];
      for(int i=0;i<arr.length;i++){
        arr[i]=lis.get(i).getKey();
      }
      return arr;
    }

}
