class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
         return false;
        }
        int n=s1.length();
        int m=s2.length();
        int[] freq=new int[26];
        int[] freq2=new int[26];
       for(int i=0;i<n;i++){
        freq[s1.charAt(i)-'a']++;
        freq2[s2.charAt(i)-'a']++;
       }
      if(match(freq,freq2)){
        return true;
      }
      int l=0;
      for(int r=n;r<m;r++){
        freq2[s2.charAt(r)-'a']++;
        freq2[s2.charAt(l)-'a']--;
        l++;
        if(match(freq,freq2)){
            return true;
        }
      }
      return false;
    }
    public boolean match(int[] freq,int[] freq2){
        for(int i=0;i<26;i++){
            if(freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
