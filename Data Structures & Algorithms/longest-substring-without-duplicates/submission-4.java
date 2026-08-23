class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if(n==0) return 0;
        int max = 1;
        int j=0;

        HashSet<Character> set = new HashSet<Character>();

        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }
        return max;
        
    }
}