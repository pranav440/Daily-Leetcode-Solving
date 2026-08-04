class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        Arrays.sort(nums);
        int ele = nums[0];
        for(int i=0; i<nums.length;ele++, i++){
            if(ele<nums[i]){
              list1.add(ele);
              i--;
            }
        }
        return list1;
    }
}