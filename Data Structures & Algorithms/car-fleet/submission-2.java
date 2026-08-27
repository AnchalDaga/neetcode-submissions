class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = speed.length;
        double time= 0.00;
        Stack<Double> stack = new Stack<Double>();

        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        for(int i=0;i<n;i++){
            time = (double)(target - cars[i][0])/cars[i][1];
            if(!stack.isEmpty() && stack.peek() >= time){
               continue;
            }
            
            stack.push(time);
            
        }

        return stack.size();

        
    }
}
