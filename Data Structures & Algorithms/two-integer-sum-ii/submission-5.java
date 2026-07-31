class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
       
        HashMap<Integer,Integer>hh=new HashMap<>();
        for(int i=0;i<n;i++){
           int sum=target-numbers[i];
           if(hh.containsKey(sum)){
            return new int[]{hh.get(sum),i+1};
           }
           hh.put(numbers[i],i+1);
        }
        return new int[0];
    }
}