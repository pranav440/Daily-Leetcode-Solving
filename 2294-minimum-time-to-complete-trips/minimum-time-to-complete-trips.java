class Solution {

    static boolean isValid(int[] time, int totalTrips, long mid) {

        long trips = 0;

        for (int t : time) {
            trips += mid / t;

            if (trips >= totalTrips)
                return true;
        }

        return false;
    }

    public long minimumTime(int[] time, int totalTrips) {

        long s = 1;

        long min = Integer.MAX_VALUE;

        for (int t : time)
            min = Math.min(min, t);

        long e = min * (long) totalTrips;

        long ans = -1;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            if (isValid(time, totalTrips, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}