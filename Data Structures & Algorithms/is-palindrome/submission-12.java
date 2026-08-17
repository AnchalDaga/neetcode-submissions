class Solution {
    public boolean isPalindrome(String s) {

        

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        int n = s.length();

        if(s.isEmpty()) {
            return true;
        }

        // if (n == 1) {
        //     return true;
        // }
        
        int l = n-1;
        boolean res = false;

        for(int i=0;i <= l;i++){
            while(l >= i){
                if(s.charAt(i)==s.charAt(l)){
                    res = true;
                }
                else{
                    return false;
                    
                }
                l--;
                break;
            }
        }
        return res;


        
    }
}
