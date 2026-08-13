class TimeMap {
    Map<String, List<String>>valueMap ;
    Map<String, List<Integer>>timeStampMap ;
    public TimeMap() {
        this.valueMap = new HashMap() ;
        this.timeStampMap = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        valueMap.putIfAbsent(key, new ArrayList());
        timeStampMap.putIfAbsent(key, new ArrayList());

        valueMap.get(key).add(value);
        timeStampMap.get(key).add(timestamp);
    }
    
    public String get(String key, int timestamp) {
        if(!valueMap.containsKey(key)){
            return "" ;
        }

        List<String>values =  valueMap.get(key);
        List<Integer>times =  timeStampMap.get(key);
        int low = 0, high = times.size() - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (times.get(mid) <= timestamp) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans == -1 ? "" : values.get(ans);
    }
}
