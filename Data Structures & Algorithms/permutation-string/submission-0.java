class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[] = new int[26] ;
        int freq2[] = new int[26] ;

        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++ ;
        }

        int left = 0 ;
        for(int right = 0 ; right < s2.length() ; right++){
            char ch = s2.charAt(right) ;
            freq2[ch-'a']++ ;
            int len = right - left + 1 ;

            if(len > s1.length()){
                freq2[s2.charAt(left) - 'a']-- ;
                left++ ;
            }

            if(Arrays.equals(freq1, freq2)){
                return true ;
            }
        }
        return false ;
    }
}
