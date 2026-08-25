class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,ArrayList<String>>hh=new HashMap<>();
        for(int i=0;i<n;i++){
            String word=strs[i];
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sort=new String(arr);
            if(hh.containsKey(sort)){
                hh.get(sort).add(word);
            }
            else{
                ArrayList<String>list=new ArrayList<>();
                list.add(word);
                hh.put(sort,list);
            }
        }
        return new ArrayList<>(hh.values());
    }
}