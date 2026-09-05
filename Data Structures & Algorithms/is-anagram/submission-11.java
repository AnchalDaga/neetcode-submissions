class Solution {
    public boolean isAnagram(String s, String t) {


        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2){
            return false;
        }

        HashMap<Character,Integer> set1 = new HashMap<>();
        HashMap<Character,Integer> set2 = new HashMap<>();

        



        for(int i=0;i<n1;i++){
            if(set1.containsKey(s.charAt(i))){
                set1.put(s.charAt(i),set1.get(s.charAt(i))+1);
            }
            else if (!set1.containsKey(s.charAt(i))){
                set1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<n2;i++){
            if(set2.containsKey(t.charAt(i))){
                set2.put(t.charAt(i),set2.get(t.charAt(i))+1);
            }
            else if (!set2.containsKey(t.charAt(i))){
                set2.put(t.charAt(i),1);
            }
        }
        

        return set1.equals(set2);

    }
}
