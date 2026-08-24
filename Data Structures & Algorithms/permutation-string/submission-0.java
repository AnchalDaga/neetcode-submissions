class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int left = 0;

        if(n1>n2){
            return false;
        }

        int[] charArr = new int[26];

        for(int i=0;i<n1;i++){
            charArr[s1.charAt(i)-'a']++;
        }

        int[] window = new int[26];


        for(int right=0;right<n2;right++){

            window[s2.charAt(right) - 'a']++;

            if(right-left+1>n1){
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            if(right-left+1 ==n1){
                if(Arrays.equals(charArr,window)){
                    return true;
                }
            }

        }
        return false;       
    }
}
