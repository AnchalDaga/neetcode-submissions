class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map  = new HashMap<>();

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        List <Integer>[] res = new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(res[freq] != null){
                res[freq].add(num);
            }
            else{
                res[freq] = new ArrayList<>();
                res[freq].add(num);
            }
        }

        int[] arr = new int[k];
        int j = 0;
        for(int i=res.length-1; i>=0; i--){
            if(res[i] != null) {
                for(int num : res[i]) {
                    arr[j] = num;
                    j++;
                    if(j == k) {
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
}
