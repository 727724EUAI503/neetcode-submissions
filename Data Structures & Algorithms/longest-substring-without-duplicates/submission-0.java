class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int max=0;
        HashSet<Character>hs=new HashSet<>();
        while(r<n){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
            }
            int len=r-l+1;
            max=Math.max(max,len);
            r++;
        }
        return max;
    }
}
