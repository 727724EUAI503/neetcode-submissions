class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n=nums.length;
       HashMap<Integer,Integer>hh=new HashMap<>();
       for(int i=0;i<n;i++){
        hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
       }
       PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hh.get(a)-hh.get(b));
       for(int num:hh.keySet()){
        pq.offer(num);
        while(pq.size()>k){
            pq.poll();
        }
       }
       int[] arr=new int[k];
       for(int i=0;i<k;i++){
        arr[i]=pq.poll();
       }
       return arr;
    }
}