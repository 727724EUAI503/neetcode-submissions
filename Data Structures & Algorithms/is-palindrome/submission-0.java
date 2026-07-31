class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int st=0;
        int r=n-1;
        while(st<r){
        
        while(st<r && !Character.isLetterOrDigit(s.charAt(st))){
           st++;
        }
        while(st<r && !Character.isLetterOrDigit(s.charAt(r))){
            r--;
        }
        char ch1=Character.toLowerCase(s.charAt(st));
        char ch2=Character.toLowerCase(s.charAt(r));

        if(ch1!=ch2){
            return false;
        }
      st++;
      r--;
        
    }
        return true;
    }
}
