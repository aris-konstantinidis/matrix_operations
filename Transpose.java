public class Transpose {

    public static int[][] transpose(int[][] matrix) {
      int[][] transpose = new int[matrix[0].length][matrix.length];
      for (int i = 0; i < matrix.length; i++ ) {
        for (int j = 0; j < matrix[0].length; j++) {
          transpose[j][i] = matrix[i][j];
        }
      }
      return transpose;
    }

    public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          System.out.printf("%5d", matrix[i][j]);
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
      int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
      printMatrix(transpose(A));
    }

}
