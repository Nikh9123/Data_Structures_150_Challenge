class TimeMap {
    Map<String, List<Integer>> timestampMap;
    Map<String, List<String>> valuesMap;

    public TimeMap() {
        this.timestampMap = new HashMap<>();
        this.valuesMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        valuesMap.putIfAbsent(key, new ArrayList<>());
        timestampMap.putIfAbsent(key, new ArrayList<>());

        valuesMap.get(key).add(value);
        timestampMap.get(key).add(timestamp);
    }

    public String get(String key, int timestamp) {
        if (!valuesMap.containsKey(key)) {
            return "";
        }

        List<String> valuesList = valuesMap.get(key);
        List<Integer> timestampList = timestampMap.get(key);

        int ans = -1;
        int low = 0;
        int high = timestampList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (timestampList.get(mid) <= timestamp) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans == -1 ? "" : valuesList.get(ans);
    }
}