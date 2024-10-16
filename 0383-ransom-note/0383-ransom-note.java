class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> charCount = new HashMap<>();
    
    // Count the occurrences of each character in the magazine
    for (char c : magazine.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    
    // Check if we have enough characters to construct the ransom note
    for (char c : ransomNote.toCharArray()) {
        if (!charCount.containsKey(c) || charCount.get(c) == 0) {
            return false;
        }
        charCount.put(c, charCount.get(c) - 1);
    }
    
    return true;
}
}