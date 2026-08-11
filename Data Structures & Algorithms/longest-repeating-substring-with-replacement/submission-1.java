class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26] ;
        int left = 0, maxFreq = 0, maxLen = 0 ;

        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            freq[ch - 'A']++ ;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);
            int len = right - left + 1 ;
            int validWindow = len - maxFreq ;

            while(validWindow > k){
                freq[s.charAt(left) - 'A']-- ;
                left++ ;
                len = right - left + 1 ;
                validWindow = len - maxFreq ;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen ;
    }
}
