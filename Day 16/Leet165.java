class Solution {
    public int compareVersion(String version1, String version2) {
        String[] revision1 = version1.split("\\.");
        String[] revision2 = version2.split("\\.");

        int n = Math.max(revision1.length, revision2.length);

        for (int i = 0; i < n; i++) {
            int v1;
            if (i < revision1.length) {
                v1 = Integer.parseInt(revision1[i]);
            } else {
                v1 = 0;
            }

            int v2;
            if (i < revision2.length) {
                v2 = Integer.parseInt(revision2[i]);
            } else {
                v2 = 0;
            }

            if (v1 < v2) return -1;
            if (v1 > v2) return 1;
        }
        return 0;
    }
}
