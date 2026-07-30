class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         }

         List<int[]> arr = new ArrayList();
         for (Map.Entry<Integer,Integer> data : map.entrySet()){
            arr.add(new int[]{data.getKey(), data.getValue()});
         }
         arr.sort((a,b) -> b[1] - a[1]);
         int[] response = new int[k];
         for(int i=0;i<k;i++){
            response[i] = arr.get(i)[0];
         }
         return response;
    }
}
