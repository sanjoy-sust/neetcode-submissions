class Solution {

    public String encode(List<String> strs) {
       StringBuilder output = new StringBuilder();

       for(String str: strs){
            output.append(str.length()).append('#').append(str);
       }
       return output.toString();
    }

    public List<String> decode(String str) {

        List<String> response = new ArrayList<>();

        for (int i=0; i < str.length(); ){
            int j =i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i+length;
            response.add(str.substring(i,j));
            i =j;
        }
        return response;
    }
}
