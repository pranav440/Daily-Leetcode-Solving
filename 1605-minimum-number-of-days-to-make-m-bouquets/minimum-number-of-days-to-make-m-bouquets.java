class Solution {

    static boolean isTrue(int[] bloomDay, int m, int k, int mid) {

        int consecutive = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {

                consecutive++;

                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                }

            } else {
                consecutive = 0;
            }

            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int s = 1;

        int max = bloomDay[0];

        for (int i = 1; i < bloomDay.length; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        int e = max;
        int ans = 0;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isTrue(bloomDay, m, k, mid)) {

                ans = mid;
                e = mid - 1;

            } else {

                s = mid + 1;
            }
        }

        return ans;
    }
}