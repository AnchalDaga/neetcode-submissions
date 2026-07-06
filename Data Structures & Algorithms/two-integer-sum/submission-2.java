class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int res[] = new int[2];

        while(i<n){
            j = i+1;
            while(j<n){
                if(nums[i] + nums[j] == target){
                    res[0]  = i;
                    res[1] = j;
                    break;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return res;
        
    }
}
