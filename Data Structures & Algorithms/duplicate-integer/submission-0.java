class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i< nums.length;i++){
            Integer existingKey = map.get(nums[i]);
            if(existingKey == null){
                map.put(nums[i],1);
            } else {
                return true;
            }
        }
        return false;
    }
}