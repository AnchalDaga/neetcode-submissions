class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int[] res = new int[2];
        while(i<nums.length){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;
                break;
            }
            else{
                map.put(nums[i],i);
                i++;
            }
        }
        return res;
        
    }
}
