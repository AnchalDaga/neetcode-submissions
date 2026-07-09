class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap map = new HashMap<>();
        int[] res = new int[nums.length]; 

        int pre_i = 0;
        int post_i = nums.length-1;
        for(int i=0;i<nums.length;i++){
                int prod = 1;
                for(int j = 0; j < i; j++) {
                prod *= nums[j];
            }

            // right side
            for(int j = i + 1; j < nums.length; j++) {
                prod *= nums[j];
            }

            res[i] = prod;
            
        }
        return res;

    }
}  
