class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap();

        for(String str : strs){
            char keyArr[] = str.toCharArray();
            Arrays.sort(keyArr);
            String key = new String(keyArr);

            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}
