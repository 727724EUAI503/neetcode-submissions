class Solution {
    public boolean isAnagram(String s, String t) {
       int n=s.length();
       int m=t.length();
       if(n!=m){
        return false;
       }
       HashMap<Character,Integer>hh1=new HashMap<>();
       HashMap<Character,Integer>hh2=new HashMap<>();

       for(int i=0;i<n;i++){
        hh1.put(s.charAt(i),hh1.getOrDefault(s.charAt(i),0)+1);
       }
       for(int j=0;j<m;j++){
        hh2.put(t.charAt(j),hh2.getOrDefault(t.charAt(j),0)+1);
       }
       for(int i=0;i<n;i++){
        if(!hh1.get(s.charAt(i)).equals(hh2.get(s.charAt(i)))){
          return false;
        }
       }
       return true;
    }
}
