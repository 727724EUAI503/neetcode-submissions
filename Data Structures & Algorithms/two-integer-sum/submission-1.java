class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n=nums.length;
    HashMap<Integer,Integer>hh=new HashMap<>();
    for(int i=0;i<n;i++){
      int sum=target-nums[i];
      if(hh.containsKey(sum)){
        return new int[]{hh.get(sum),i};
      }
      hh.put(nums[i],i);
    }
    return null;
    }
}
