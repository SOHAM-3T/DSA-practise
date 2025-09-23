class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int n = words.length;

        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpaces++;
        }

        int spaceBetween;
        int extraSpaces;
        if (n == 1) {
            spaceBetween = 0;
            extraSpaces = totalSpaces;
        } else {
            spaceBetween = totalSpaces / (n - 1);
            extraSpaces = totalSpaces % (n - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(words[i]);
            if (i != n - 1) {
                for (int k = 0; k < spaceBetween; k++) {
                    sb.append(" ");
                }
            }
        }
        for (int k = 0; k < extraSpaces; k++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}