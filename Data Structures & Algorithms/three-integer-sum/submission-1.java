class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);

            for(int i=0;i<n;i++){
                if(i > 0 && nums[i] == nums[i-1]){
                    continue;
                }
                int left=i+1;
                int right = n-1;
                while(left<right){
                    if(nums[i]+nums[left]+nums[right]== 0)
                    {
                        ArrayList <Integer> trip  = new ArrayList<>();
                        trip.add(nums[i]);
                        trip.add(nums[left]);
                        trip.add(nums[right]);
                        result.add(trip);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                        {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) 
                        {
                            right--;
                        }
                    }
                    else if(nums[i]+nums[left]+nums[right]< 0){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }

        
        return result;
        
    }
}
