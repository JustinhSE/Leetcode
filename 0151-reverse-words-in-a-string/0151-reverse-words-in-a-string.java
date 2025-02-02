class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String result = "";
        for(int i = str.length-1; i >= 0; i--){
            result += str[i];
            result = result.trim();
            result += " ";

        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}