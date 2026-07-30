class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,List<String>> anagramGroup = new HashMap<>();

      for(int i = 0; i<strs.length; i++) {
        
        String key = strs[i];
        char[] keyArr = key.toCharArray();
        Arrays.sort(keyArr);
        String sortedKey = new String(keyArr);
        anagramGroup.putIfAbsent(sortedKey, new ArrayList());
        anagramGroup.get(sortedKey).add(key);
      }
      return new ArrayList(anagramGroup.values());
    }
}
