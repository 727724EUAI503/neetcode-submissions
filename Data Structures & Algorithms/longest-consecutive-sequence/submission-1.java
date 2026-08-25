class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       int max=0;
       HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<n;i++){
        hs.add(nums[i]);
       }
       for(int x:hs){
        if(!hs.contains(x-1)){
            int num=x;
            int cnt=1;
            while(hs.contains(num+1)){
                cnt++;
                num=num+1;
            }
            max=Math.max(max,cnt);
        }
       }
       return max;
    }
}
