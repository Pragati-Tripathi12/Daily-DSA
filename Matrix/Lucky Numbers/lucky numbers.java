import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int a = matrix[i][0];
            int j = 0;
            for (int col = 1; col < matrix[i].length; col++) {
                if (matrix[i][col] < a) {
                    a = matrix[i][col];
                    j = col;
                }
            }

            int maxi = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                maxi = Math.max(maxi, matrix[k][j]);
            }

            if (maxi == a) {
                v.add(a);
            }
        }

        return v;
    }
}
