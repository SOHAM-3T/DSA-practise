class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int leftmost = Math.min(a, Math.min(b, c));
        int rightmost = Math.max(a, Math.max(b, c));
        int middle = a + b + c - leftmost - rightmost;

        int minimumMoves = 0;
        int maximumMoves = 0;

        if (rightmost - leftmost > 2) {
            if (middle - leftmost <= 2 || rightmost - middle <= 2) {
                minimumMoves = 1;
            } else {
                minimumMoves = 2;
            }
            maximumMoves = rightmost - leftmost - 2;
        }
        return new int[] {minimumMoves, maximumMoves};
    }
}