class Solution {
    public int maxArea(int[] heights) {
       int n=heights.length;
       int l=0;
       int r=n-1;
       int min=0;
       int max=0;
       int ans=0;
       while(l<r){
         int width=r-l;
         min=Math.min(heights[l],heights[r]);
         ans=width*min;
         max=Math.max(max,ans);
         if(heights[l]<heights[r]){
            l++;
         }
         else{
            r--;
         }
       }
       return max;
    }
}