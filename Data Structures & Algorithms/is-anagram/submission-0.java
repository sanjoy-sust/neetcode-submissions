class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSort = s.toCharArray();
        Arrays.sort(sSort);
        String sortedStrS = new String(sSort);
        char[] tSort = t.toCharArray();
        Arrays.sort(tSort);
        String sortedStrT = new String(tSort);
        return sortedStrT.equals(sortedStrS);
    }
}
