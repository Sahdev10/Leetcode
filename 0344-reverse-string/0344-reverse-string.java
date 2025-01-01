class Solution {
    public void reverseString(char[] s) {
        int c= s.length-1;
        str(s,0,c);
    }
    static char[] str(char[] s , int i,int c){
          if(i>=c){
            return s;
          }
          char k = s[i];
          s[i] = s[c];
          s[c] = k;
           
           return str(s,i+1,c-1);
    }
}