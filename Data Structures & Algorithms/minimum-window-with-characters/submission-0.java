class Solution {
    public String minWindow(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();
        int left = 0;
        int finalLength = Integer.MAX_VALUE;
        String result = "";

        if(n1<n2){
            return "";
        }

        int[] charArr = new int[256];
        for(char ch:t.toCharArray()){
            charArr[ch]++;
        }

        int[] window = new int[256];

        for(int right = 0;right<n1;right++){

            window[s.charAt(right)]++;

            while(isvalid(charArr, window)){
                int currentL = right-left+1;
                if(currentL<finalLength){
                    finalLength = currentL;
                    result = s.substring(left,right+1);
                }
                window[s.charAt(left)]--;
                left++;
            }
        }
        return result;
        
    }

    private boolean isvalid(int[]charArr, int[]window){
        for(int i =0;i<256;i++){
            if(window[i]<charArr[i]){
                return false;
            }
        }
        return true;
    }
}
