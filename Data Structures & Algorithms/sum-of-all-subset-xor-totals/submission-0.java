class Solution {
    public int subsetXORSum(int[] nums) {
        return findXOR(nums,0,0);
        
    }

    public int findXOR(int[] nums, int i, int xor){
        if(i == nums.length){
            return xor;
        }

        int pick = findXOR(nums, i+1, xor ^ nums[i]);
        int nopick = findXOR(nums, i+1, xor);

        return pick+nopick;

    }
}