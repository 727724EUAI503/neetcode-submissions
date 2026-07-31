class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int s=i-1;
            int j=i+1;
            int sum=1;
            while(s>=0 || j<=n-1){
               if(s>=0){
                sum=sum*nums[s];
                s--;
               }
               if(j<=n-1){
                sum=sum*nums[j];
                j++;
               }
            }
           arr[i]=sum;
            
        }

        return arr;
    
} 
} 
