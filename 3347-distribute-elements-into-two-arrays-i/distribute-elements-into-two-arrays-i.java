class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int j = 2;

        while (j < nums.length) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[j]);
            } else {
                arr2.add(nums[j]);
            }

            j++;
        }

        int[] ans = new int[nums.length];
        int k = 0;

        for (int x : arr1) {
            ans[k++] = x;
        }

        for (int x : arr2) {
            ans[k++] = x;
        }

        return ans;
    }
}