class Solution {
  public int longestString(int x, int y, int z) {
    final int min = Math.min(x, y);
    if (x == y)
      return (min * 2 + z) * 2;
    return (min * 2 + 1 + z) * 2;
  }
}