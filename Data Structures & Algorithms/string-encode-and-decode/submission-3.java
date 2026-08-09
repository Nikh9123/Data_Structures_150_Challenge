class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "" ;
        }
        List<Integer>sizes = new ArrayList<>() ;
        StringBuilder string = new StringBuilder();

        for(String str : strs){
            sizes.add(str.length());
        }

        for(int size : sizes){
            string.append(size).append(',');
        }

        string.append('#');

        for(String str : strs){
            string.append(str);
        }

        return string.toString() ;
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>() ;
        }

        List<String>ans = new ArrayList<>() ;
        List<Integer>sizes = new ArrayList<>() ;
        int i = 0 ;
        while(str.charAt(i) != '#'){
            StringBuilder curr = new StringBuilder() ;
    
            while(str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++ ;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++ ;
        }
        i++ ;

        for(int sz : sizes){
            ans.add(str.substring(i, i+sz));
            i += sz ;
        }
        return ans ;
    }
}
