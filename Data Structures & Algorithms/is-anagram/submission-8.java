class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char i: s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char j: t.toCharArray()){
            map.put(j,map.getOrDefault(j,0)-1);
        }

        for(int val: map.values()){
            if(val != 0){
                return false;
            }
        }
        return true;


    }
}
