class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int i=0;
        while(i<nums.length){
            if(map.contains(nums[i])){
                return true;
            }
            else{
                map.add(nums[i]);
            }
            i++;
        }
        return false;
    }
}