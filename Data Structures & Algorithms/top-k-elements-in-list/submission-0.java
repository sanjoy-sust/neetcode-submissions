class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         }

        Map<Integer, Integer> sortedMap = 
                        map.entrySet()
                        .stream()
                        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                                  Map.Entry::getValue,
                                                  (a,b)->a,
                                                  LinkedHashMap::new));
      return sortedMap.keySet()
                .stream()
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
