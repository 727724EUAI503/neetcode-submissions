class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs=new HashSet<>();
        int n=s.length();
        int l=0;
        int r=0;
        int max=0;
        while(r<n){
            while(hs.contains(s.charAt(r))){
              hs.remove(s.charAt(l));
              l++;
            }
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}