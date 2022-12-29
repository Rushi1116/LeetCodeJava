class Solution {
    public boolean equalFrequency(String word) {
         for (int i = 0; i < word.length(); i++) {
            StringBuilder temp = new StringBuilder(word);
            temp.deleteCharAt(i);
            String str = temp.toString();

            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            Set<Integer> set = new HashSet<>();
            for (int f : freq) {
                if (f > 0) set.add(f);
            }

            if (set.size() == 1) return true;
        }

        return false;  
    }
}
