class Solution {
    String[] array1;
    String[] array2; 
    
    public boolean isAnagram(String s, String t) {
        char[] s1 = (s.toCharArray());
        char[] s2 = (t.toCharArray());
        Arrays.sort(s1);
        Arrays.sort(s2);
        String temp  = Arrays.toString(s1);
        String temp2 = (Arrays.toString(s2));
        return temp.equals(temp2);
    }
}