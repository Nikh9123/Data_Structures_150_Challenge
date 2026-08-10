class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0 ;
        int freq[] = new int[256] ;
        int maxLen = 0 ;
        Arrays.fill(freq, -1) ;
        for( ; right < s.length() ; right++){
            char ch = s.charAt(right) ;

            if(freq[ch] != -1){
                left = Math.max(left, freq[ch] + 1);
            }

            freq[ch] = right ;
            maxLen = Math.max(maxLen, right - left + 1) ;
        }
        return maxLen ;
    }
}
