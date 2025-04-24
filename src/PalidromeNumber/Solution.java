package PalidromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 ){
            return false;
        }
        if( x < 10 && x > 0  ){
            return true;
        }

        String s = String.valueOf(x);
        for(int i = 0; i<= s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}