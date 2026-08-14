class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sortedS = new char[s.length()];
        char[] sortedT = new char[t.length()];

        if(s.length() != t.length()){
            return false;
        }

        int i = 0;
        for(i=0;i<s.length();i++){
            sortedS[i] = s.charAt(i);
        }
        for(i=0;i<t.length();i++){
            sortedT[i] = t.charAt(i);
        }

        Arrays.sort(sortedT);
        Arrays.sort(sortedS);


        if(Arrays.equals(sortedS, sortedT)){
            return true;
        }
        return false;

    }
}
