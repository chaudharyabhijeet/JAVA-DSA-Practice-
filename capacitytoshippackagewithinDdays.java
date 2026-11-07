class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            int totalDays = 1;
            int sum = 0;

            for (int i = 0; i < weights.length; i++) {

                if (sum + weights[i] > mid) {
                    totalDays++;
                    sum = weights[i];
                } 
                else {
                    sum += weights[i];
                }
            }

            if (totalDays > days) {
                low = mid + 1;
            } 
            else {
                high = mid;
            }
        }

        return low;
    }
}
