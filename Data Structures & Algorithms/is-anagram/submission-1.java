class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
           return false;
        char[] sSort = s.toCharArray();
        Arrays.sort(sSort);
        String sortedStrS = new String(sSort);
        char[] tSort = t.toCharArray();
        Arrays.sort(tSort);
        String sortedStrT = new String(tSort);
        return sortedStrT.equals(sortedStrS);
    }
}
