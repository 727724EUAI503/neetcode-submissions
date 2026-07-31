class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>hh=new HashMap<>();
        int[]arr=new int[k];
        for(int i=0;i<n;i++){
            hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        while(j<k){
            int max=0;
            int maxfreq=0;
          for(int i=0;i<n;i++){
            if(hh.containsKey(nums[i])&&hh.get(nums[i])>maxfreq){
                maxfreq=hh.get(nums[i]);
                max=nums[i];
            }
          }
            
             arr[j]=max;
             j++;
            
            hh.remove(max);
          
        }
        return arr;
    }
}
