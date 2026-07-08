class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();


        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if(map.containsKey(key)){
                map.get(key).add(s);
            } 
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        List <List<String>> res = new ArrayList<>(map.values());
        return res;


        
    }
}
