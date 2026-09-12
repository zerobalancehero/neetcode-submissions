class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int high=heights.length-1;
        int low=0;
        while(low<high){
            int area=(high-low)*Math.min(heights[low],heights[high]);
            max=Math.max(max,area);
           if(heights[low]<heights[high]){
            low++;
           }
           else{
            high--;
           }
        }
        return max;
    }
}
