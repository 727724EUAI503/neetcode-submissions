class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>>hh=new HashMap<>();
        List<List<String>>string=new ArrayList<>();
        for(int i=0;i<n;i++){
            String word=strs[i];
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(hh.containsKey(str)){
                hh.get(str).add(word);
            }
            else{
                ArrayList<String>list=new ArrayList<>();
                list.add(word);
                hh.put(str,list);
            }
        }
        return new ArrayList<>(hh.values());
        
    }
}
