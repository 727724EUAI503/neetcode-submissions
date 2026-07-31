class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer>hh=new HashMap<>();
        for(int i=0;i<n;i++){
           int sum=target-numbers[i];
           if(hh.containsKey(sum)){
            arr[0]=hh.get(sum);
            arr[1]=i+1;
            return arr;
           }
           hh.put(numbers[i],i+1);
        }
        return new int[0];
    }
}