class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        int left = 0;
        int maxFreq = 0;
        int[] freq = new int[26];

        int maxWindow = 0;

        for(int i=0;i<n;i++){
            freq[s.charAt(i) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(i) - 'A']);
            int windowSize = i-left+1;

            if(windowSize-maxFreq>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windowSize = i-left+1;
            maxWindow = Math.max(maxWindow,windowSize);
        }

        return maxWindow;
    }
}
