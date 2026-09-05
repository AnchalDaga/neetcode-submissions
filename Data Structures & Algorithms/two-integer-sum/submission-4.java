class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;

        while(i<n){

            int diff = target-nums[i];

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
