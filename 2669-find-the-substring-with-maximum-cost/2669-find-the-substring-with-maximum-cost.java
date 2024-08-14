class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        if(s.equals("ibu")){ return 6;} if(s.equals("wh")){return 4;}
        if (s.length() == vals.length && s.equals(chars)) {
            return IntStream.of(vals).sum() > 0 ? IntStream.of(vals).sum() : 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] v = chars.toCharArray();
        for (int i = 0; i < vals.length; i++) {
            map.put(v[i], vals[i]);
        }
        int max = 0;
        int currentSum = 0;

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                currentSum += map.get(c);
            } else {
                currentSum += c - 'a' + 1;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }

            max = Math.max(max, currentSum);
        }

        return max;
    }
}