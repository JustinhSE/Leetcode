class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){return true;}
        int index = t.indexOf(s.charAt(0)); 
        if(s.length() == 0 || (index > 0  && s.length() == 1)){ return true; }
        if(s.length() > t.length() || index == -1 ){ return false; }
        return isSubsequence(s.substring(1) , t.substring(index + 1)); 
    }
}