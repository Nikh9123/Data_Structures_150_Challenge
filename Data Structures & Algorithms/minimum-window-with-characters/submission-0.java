class Solution {
    public String minWindow(String s, String t) {
        int tFreq[] = new int[128], left = 0, right = 0 , minLen = Integer.MAX_VALUE , cnt = 0, startIndex = 0 ;

        for(char ch : t.toCharArray()){
            tFreq[ch]++ ;
        }

        for(; right < s.length() ; right++){
            char ch =  s.charAt(right);

            if(tFreq[ch] > 0){
                cnt++ ;
            }

            tFreq[ch]-- ;

            while(cnt == t.length()){
                int currLen = right - left + 1 ;

                if(currLen < minLen){
                    startIndex = left ;
                    minLen = currLen ;
                }
                //move left pointer and increase freq so that we cna know we remoed this character from window
                tFreq[s.charAt(left)]++ ;
                if(tFreq[s.charAt(left)] > 0){
                    cnt-- ;
                }
                left++ ;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex+minLen);

    }
}
