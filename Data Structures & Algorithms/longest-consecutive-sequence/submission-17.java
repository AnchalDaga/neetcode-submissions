class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int count = 1;
        int max =1;
        Arrays.sort(nums);

        int i=0;
        for(i=0;i+1<n;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            else if(nums[i]+1 == nums[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }

        return max;
        
    }
}
