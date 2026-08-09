class Solution {
    public boolean isPalindrome(String s) {
        int low = 0, high = s.length()-1 ;
        while(low < high){
            while(low < high && !isAlphaNumeric(s.charAt(low))){
                low++ ;
            }
            while(low < high && !isAlphaNumeric(s.charAt(high))){
                high-- ;
            }

            if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))){
                return false ;
            }
            low++ ;
            high-- ;
        }
        return true ;
    }

    boolean isAlphaNumeric(char ch){
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
            return true ;
        }

        return false ;
    }
}
