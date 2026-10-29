class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find the maximum pile
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            long totalhours = 0;

            for (int i = 0; i < piles.length; i++) {
                int pile = piles[i];
                totalhours += (pile + (long) mid - 1) / mid;
            }

            if (totalhours > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
