class Solution {
    public void pattern22(int n) {
        int size = 2 * n - 1;
        int center = n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int distFromCenter = Math.max(Math.abs(i - center), Math.abs(j - center));
                System.out.print((distFromCenter + 1) + " ");
            }
            System.out.println();
        }

    }
}