class Solution {
  public String longestCommonPrefix(String[] strs) {
    // Handle base case.
    if (strs.length == 0) {
      return "";
    }

    // Find first and last strings alphabetically.
    String first = strs[0];
    String last = strs[0];
    for (int i = 1; i < strs.length; i++) {
      if (first.compareTo(strs[i]) > 0) {
        first = strs[i];
      }
      if (last.compareTo(strs[i]) < 0) {
        last = strs[i];
      }
    }

    // Find the common prefix between the first and last.
    int minLen = first.length() < last.length() ? first.length() : last.length();
    for (int i = 0; i < minLen; i++) {
      if (first.charAt(i) != last.charAt(i)) {
        return first.substring(0, i);
      }
    }
    return first.substring(0, minLen);
  }
}
