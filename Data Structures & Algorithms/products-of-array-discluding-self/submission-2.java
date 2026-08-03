class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans=1;
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            ans*=nums[i];
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(zero==0){
                nums[i]=ans/nums[i];
            }
            else{
                if(nums[i]==0 && zero==1){
                    nums[i]=ans;
                }
                else{
                    nums[i]=0;
                }
            }
        }
        return nums;
    }
}