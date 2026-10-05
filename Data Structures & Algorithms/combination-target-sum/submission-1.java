class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int target = 0;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.target = target;
        getComb(nums,0,0,new ArrayList<>());
        return res;    
    }

    public void getComb(int[] nums,int sum, int i, List<Integer> list){

        
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum > target || i == nums.length ){
            return;
        }

        list.add(nums[i]);
        sum +=nums[i];
        getComb(nums,sum,i,list);

        //nopick
        list.remove(list.size()-1);
        sum = sum-nums[i];
        getComb(nums,sum,i+1,list);
        
    }
    
}
