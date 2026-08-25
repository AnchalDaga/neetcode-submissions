class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<Character>();

        HashMap<Character, Character> map = new HashMap<>();
        boolean result = false;

        map.put(']','[');
        map.put('}','{');
        map.put(')','(');

        for(int i =0;i<n;i++){
                     
            if(map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(map.containsKey(s.charAt(i))){

                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char c = stack.pop();
                    if(map.get(s.charAt(i)) != c){
                        return false;
                    }
                }
            }   
        }

        return stack.isEmpty();

    }
}
