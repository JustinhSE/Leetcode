class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()){return false;}
        if(s.length() == 0) {return true;}
        int p = 0;
        for(int i = 0; i < t.length();i++){
            if(t.charAt(i) == s.charAt(p)){
                p++;
            }
            if(p == s.length()){
                return true;
            }
        }
        return p == s.length();
    }
}