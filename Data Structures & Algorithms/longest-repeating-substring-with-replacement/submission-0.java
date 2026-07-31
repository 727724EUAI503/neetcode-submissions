class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int max=0;
        int len=0;
        int l=0;
        int[] freq=new int[26];
        for(int r=0;r<n;r++){
            freq[s.charAt(r)-'A']++;
            max=Math.max(max,freq[s.charAt(r)-'A']);
            while((r-l+1)-max>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}