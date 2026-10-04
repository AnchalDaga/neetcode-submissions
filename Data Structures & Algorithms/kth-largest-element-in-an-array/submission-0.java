class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();



        if(nums.length == 0){
            return 0;
        }

        for(int num:nums){
            pq.add(num);

            if(pq.size() >k){
                pq.poll();
            }
        }

        return pq.poll();
    }
}
