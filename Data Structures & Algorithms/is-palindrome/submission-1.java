class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            char ch1=s.charAt(left);
            char ch2=s.charAt(right);
            if(!Character.isLetterOrDigit(ch1)){
                left++;
            }
            else if(!Character.isLetterOrDigit(ch2)){
                right--;
            }
            else{
            ch1=Character.toLowerCase(ch1);
            ch2=Character.toLowerCase(ch2);
            if(ch1!=ch2){
                return false;
            }
            
            left++;
            right--;
            }
        }
        return true;
    }
}