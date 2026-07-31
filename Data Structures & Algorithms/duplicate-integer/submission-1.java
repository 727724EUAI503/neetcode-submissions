class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}