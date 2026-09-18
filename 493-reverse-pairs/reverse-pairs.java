class Solution {

    static int merge(int[] nums, int s, int e, int mid) {

        int leftlength = mid - s + 1;
        int rightlength = e - mid;

        int[] leftarr = new int[leftlength];
        int[] rightarr = new int[rightlength];

        // Copy left array
        int k = s;

        for (int i = 0; i < leftlength; i++) {
            leftarr[i] = nums[k];
            k++;
        }

        // Copy right array
        k = mid + 1;

        for (int j = 0; j < rightlength; j++) {
            rightarr[j] = nums[k];
            k++;
        }

        int count = 0;

        // STEP 1: Count reverse pairs
        int j = 0;

        for (int i = 0; i < leftlength; i++) {

            while (j < rightlength &&
                   (long) leftarr[i] > 2L * rightarr[j]) {

                j++;
            }

            count += j;
        }

        // STEP 2: Normal merge
        int i = 0;
        j = 0;
        k = s;

        while (i < leftlength && j < rightlength) {

            if (leftarr[i] <= rightarr[j]) {
                nums[k] = leftarr[i];
                i++;
            }
            else {
                nums[k] = rightarr[j];
                j++;
            }

            k++;
        }

        // Remaining left elements
        while (i < leftlength) {
            nums[k] = leftarr[i];
            i++;
            k++;
        }

        // Remaining right elements
        while (j < rightlength) {
            nums[k] = rightarr[j];
            j++;
            k++;
        }

        return count;
    }

    static int mergeSort(int[] nums, int s, int e) {

        if (s >= e) {
            return 0;
        }

        int mid = s + (e - s) / 2;

        int leftReversePair = mergeSort(nums, s, mid);

        int rightReversePair = mergeSort(nums, mid + 1, e);

        int finalReversePair = merge(nums, s, e, mid);

        return leftReversePair + rightReversePair + finalReversePair;
    }

    public int reversePairs(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }
}