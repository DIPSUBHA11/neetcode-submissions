class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hs1.containsKey(s.charAt(i))) {
                int num = hs1.get(s.charAt(i));
                hs1.put(s.charAt(i), num + 1);
            } else {
                hs1.put(s.charAt(i), 1);
            }
            if (hs2.containsKey(t.charAt(i))) {
                int num = hs2.get(t.charAt(i));
                hs2.put(t.charAt(i), num + 1);
            } else {
                hs2.put(t.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> hk : hs1.entrySet()) {
            char c = hk.getKey();
            int val = hk.getValue();
            int val2 = hs2.getOrDefault(c,0);
            if (val2 != val) {
                return false;
            }
        }
        return true;
    }
}
