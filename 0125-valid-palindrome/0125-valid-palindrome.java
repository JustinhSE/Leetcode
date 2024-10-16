class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1 || s.trim() == ""){ return true; }
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str += c;
            }
        }
        str = str.toLowerCase();
        StringBuilder temp = new StringBuilder(str);
        StringBuilder reversed = temp.reverse();
        System.out.println(String.valueOf(reversed) + " \n " + str);
        return String.valueOf(reversed).equals(str);
    }
}