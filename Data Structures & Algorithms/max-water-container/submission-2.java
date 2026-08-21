class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxi = 0;
        int vol = 0;
        int l = 0;
        int r = n-1;

        while(l<r){
            vol = ((r-l)*(Math.min(heights[l], heights[r])));
            maxi = Math.max(vol,maxi);


            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
            
        
        }

        return maxi;
        
        
    }
}
