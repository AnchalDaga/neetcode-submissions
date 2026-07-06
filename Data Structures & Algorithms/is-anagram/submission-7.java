class Solution {
    public boolean isAnagram(String s, String t) {
        HashSet<String> h1 = new HashSet<>();
        HashSet<String> h2 = new HashSet<>();

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sort1 = new String(s1);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String sort2 = new String(t1);

        if(sort1.equals(sort2)){
            return true;
        }
        else{
            return false;
        }

    }
}
