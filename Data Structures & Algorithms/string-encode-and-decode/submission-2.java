class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        String len;
        for(String i: strs){
           len = String.valueOf(i.length());
           sb.append(len).append("#").append(i);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List <String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int len = 0;
            while(str.charAt(i) !='#'){
                len = len*10 + Character.getNumericValue(str.charAt(i));
                i++;
            }
            i++;
            StringBuilder word = new StringBuilder();

            for(int j=0; j<len;j++){
                word.append(str.charAt(i));
                i++;
            }
            res.add(word.toString());

        }
        return res;

    }
}
