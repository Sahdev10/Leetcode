class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int c = x;
        int sum = 0;
        while(x>0){
          int b = x%10;
           sum = (sum*10) + b;
           x = x/10;  
        }
        // if(sum==c){
        //     return true;
        // }
        return (sum==c);
    }
}