class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> outarr=new ArrayList<>();
       int high=nums.length-1;
       int low=0;
       for(int i=0;i<nums.length-2;i++){
        
        low=i+1;
        high=nums.length-1;
        
        while(low<high){
            int sum=nums[i]+nums[high]+nums[low];
            if(sum==0){
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[high]);
                list.add(nums[low]);
                if(!outarr.contains(list)){
                    outarr.add(list);
                }
                low++;
                high--;
            }
            else if(sum<0){
                low++;
            }
            else{
                high--;
            }
        }
       }
       return outarr;
    }
}
