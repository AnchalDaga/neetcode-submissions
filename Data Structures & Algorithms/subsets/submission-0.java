class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        findSubsets(nums,0, new ArrayList<>());
        return res;
        
    }

    public void findSubsets(int[] nums, int i, List<Integer> list){
        if(i == nums.length){
            res.add(new ArrayList<>(list));
            return ;
        }
        //pick    
        list.add(nums[i]);
        findSubsets(nums,i+1,list);


        //nopick
        list.remove(list.size()-1);
        findSubsets(nums,i+1,list);




    }
}
