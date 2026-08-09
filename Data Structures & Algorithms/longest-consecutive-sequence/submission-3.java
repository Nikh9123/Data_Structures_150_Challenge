class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet();
        int maxCnt = 0 ;

        for(int ele : nums){
            set.add(ele);
        }
        
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num ;
            int cnt = 1 ;
            while(set.contains(curr+1)){
                curr++ ;
                cnt++ ;
            }
            maxCnt = Math.max(maxCnt, cnt);
            }
        }
        return maxCnt ;
    }
}
