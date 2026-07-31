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
                int val=x;
                int cnt=1;
                while(hs.contains(val+1)){
                    val=val+1;
                    cnt++;
                }
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}
