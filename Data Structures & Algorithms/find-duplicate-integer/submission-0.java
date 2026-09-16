class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int i = 0;
        int j = i+1;

        for(i=0;i<n;i++){
            j = i+1;

            if(nums[i] == nums[j]){
                return nums[i];
            }
        }
        return 0;
        
    }
}
