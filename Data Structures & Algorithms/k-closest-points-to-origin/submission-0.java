class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int[][] res = new int[k][2];
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a,b) ->  Double.compare(b[0], a[0])
        );

        
       for (int i = 0; i < points.length; i++) {
            int[] row = points[i];
            double distance = euclidean(row);
            pq.add(new double[]{distance,i});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = 0;
        while(i < k){
            double[] entry = pq.poll();
            int index = (int) entry[1];
            res[i] = points[index];
            i++;
        }

        return res;
    
    }

    public double euclidean(int[] arr){

        double dis = Math.sqrt(
        Math.pow(arr[0] - 0, 2) +
        Math.pow(arr[1] - 0, 2)
        );

        return dis;
    }
}
