package Array;

/**
 * 59.螺旋矩阵-II
 * 时间复杂度：O(n^2)，其中 n 是给定的正整数。矩阵的大小是 n×n，需要填入矩阵中的每个元素。
 * 空间复杂度：O(1)。除了返回的矩阵以外，空间复杂度是常数。
 */
public class SpiralMatrix_II_59 {
        public int[][] generateMatrix(int n) {
            // 开始值
            int num = 1;
            int size = n*n;

            // 矩阵的四个边界
            int top =0;
            int left = 0;
            int right = n-1;
            int bottom = n-1;

            // 定义一个空数组
            int[][] matrix = new int [n][n];

            // 螺旋模拟
            while(num<=size){
                for(int i = left; i<=right; i++){matrix[top][i] = num++;}
                // 四个边界 向内收缩
                top++;
                for(int i = top; i<=bottom; i++){matrix[i][right] = num++;}
                right--;
                for(int i = right; i>=left; i--){matrix[bottom][i] = num++;}
                bottom--;
                for(int i = bottom; i>=top; i--){matrix[i][left] = num++;}
                left++;
            }
            return matrix;
        }
}
