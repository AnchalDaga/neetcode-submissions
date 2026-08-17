class Solution {
    public boolean isPalindrome(String s) {

        

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        int n = s.length();

        if(s.isEmpty()) {
            return true;
        }
        
        int l = n-1;
        for(int i=0; i <= l ;i++){
            if(s.charAt(i) != s.charAt(l)){
                return false;
            }
            l--;
            
        }
        return true;


        
    }
}
