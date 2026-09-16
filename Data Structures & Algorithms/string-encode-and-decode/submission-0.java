class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> result = new ArrayList<>();
          int i=0;
          while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            String string=str.substring(i,j);
                int len=Integer.parseInt(string);
                i=j+1;
                String ans=str.substring(i,i+len);
                result.add(ans);
                i=i+len;

            }
          return result;
          }
    
}
