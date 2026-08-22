class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int water = 0;
        int count = 0;
        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = height[0];
        int left = 1;
        while (left < n) {
            maxL[left] = Math.max(maxL[left-1], height[left]);
            left++;
        }

        maxR[n-1] = height[n-1];
        int right = n-2;
        while (right >= 0) {
            maxR[right] = Math.max(maxR[right+1], height[right]);
            right--;
        }

        for(int i=1;i<n;i++){
            water = Math.min(maxL[i],maxR[i]) - height[i];
            if (water > 0){
                count += water;
            } 
            
        }

        return count;


        
    }
}
