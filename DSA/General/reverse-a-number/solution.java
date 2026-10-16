class Solution {
    public int reverseNumber(int n) {
            StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.reverse();
            return Integer.parseInt(sb.toString());
    }
}