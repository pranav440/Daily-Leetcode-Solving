class Solution {
    public int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (s == e)
                return nums[s];

            int current = nums[mid];

            int prev = Integer.MIN_VALUE;
            if (mid - 1 >= 0)
                prev = nums[mid - 1];

            int forward = Integer.MIN_VALUE;
            if (mid + 1 < nums.length)
                forward = nums[mid + 1];

            // single element
            if (current != prev && current != forward)
                return current;

            // pair starts at mid
            if (current != prev && current == forward) {

                if (mid % 2 == 0)
                    s = mid + 1;
                else
                    e = mid - 1;
            }

            // pair ends at mid
            else if (current == prev && current != forward) {

                if (mid % 2 == 0)
                    e = mid - 1;
                else
                    s = mid + 1;
            }
        }

        return -1;
    }
}