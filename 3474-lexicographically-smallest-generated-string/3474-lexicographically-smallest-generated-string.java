class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int len = n + m - 1;

        char[] word = new char[len];
        boolean[] fixed = new boolean[len];

        // Step 1: fill '?'
        for (int i = 0; i < len; i++) {
            word[i] = '?';
        }

        // Step 2: apply 'T'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (word[i + j] == '?' || word[i + j] == str2.charAt(j)) {
                        word[i + j] = str2.charAt(j);
                        fixed[i + j] = true;
                    } else {
                        return "";
                    }
                }
            }
        }

        // Step 3: fill remaining with 'a'
        for (int i = 0; i < len; i++) {
            if (word[i] == '?') {
                word[i] = 'a';
            }
        }

        // Step 4: handle 'F'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {

                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (word[i + j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    boolean changed = false;

                     for (int j = m - 1; j >= 0; j--) {
                        int pos = i + j;

                        if (!fixed[pos]) { // only change free positions
                            for (char c = 'a'; c <= 'z'; c++) {
                                if (c != str2.charAt(j)) {
                                    word[pos] = c;
                                    changed = true;
                                    break;
                                }
                            }
                        }

                        if (changed) break;
                    }

                    if (!changed) return "";
                }
            }
        }

        return new String(word);
    }
}