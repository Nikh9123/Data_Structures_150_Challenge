class Solution {

    public String encode(List<String> strs) {

        List<Integer> sizes = new ArrayList<>();
        StringBuilder encodedString = new StringBuilder();

        // Store lengths
        for (String str : strs) {
            sizes.add(str.length());
        }

        // Store lengths
        for (int size : sizes) {
            encodedString.append(size).append(",");
        }

        // Separator
        encodedString.append("#");

        // Store actual strings
        for (String str : strs) {
            encodedString.append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {

        if (str.length() == 0) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;

        // Read sizes
        while (str.charAt(i) != '#') {

            StringBuilder currSize = new StringBuilder();

            while (str.charAt(i) != ',') {
                currSize.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(currSize.toString()));

            i++; // skip comma
        }

        i++; // skip #

        // Extract strings
        for (int size : sizes) {

            ans.add(str.substring(i, i + size));

            i += size;
        }

        return ans;
    }
}