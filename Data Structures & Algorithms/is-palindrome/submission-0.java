class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        String reveresed = new StringBuilder(s).reverse().toString();
        if(s.equals(reveresed)){
            return true;
        }
        return false;
    }
}
