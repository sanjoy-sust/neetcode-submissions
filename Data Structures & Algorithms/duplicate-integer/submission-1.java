class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<Integer>();
        for(int i = 0;i< nums.length;i++){
           if(data.contains(nums[i])){
            return true;
           }
           data.add(nums[i]);
        }
        return false;
    }
}