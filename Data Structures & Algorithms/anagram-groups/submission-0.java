class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       List<List<String>> anagramGroup = new ArrayList<>();
       boolean[] matchIndex = new boolean[strs.length];

      for(int i = 0; i<strs.length; i++) {
        if(matchIndex[i] == true){
            continue;
        }
        String key = strs[i];
        List<String> values = new ArrayList<>();
        values.add(key);
        char[] keyArr = key.toCharArray();
        Arrays.sort(keyArr);
        String sortedKey = new String(keyArr);
 
        for (int j =i+1; j<strs.length; j++){
             if(matchIndex[j] == true) {
                 continue;
              }
            char[] anaToCheck = strs[j].toCharArray();
            Arrays.sort(anaToCheck);
            String anaSorted = new String(anaToCheck);
            if(sortedKey.equals(anaSorted)){
                values.add(strs[j]);
                matchIndex[j] = true;
            }
        }
        anagramGroup.add(values);
      }
      return anagramGroup;
    }
}
