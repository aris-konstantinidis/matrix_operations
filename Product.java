public class Product {

  public static int[][] product(int[][] matrixA, int[][] matrixB) {
    int[][] product = new int[matrixA.length][matrixB[0].length];
    for (int row = 0; row < matrixA.length; row++) {
      for (int col = 0; col < matrixB[0].length; col++) {
        int sum = 0;
        for (int k = 0; k < matrixA[row].length; k++) {
          sum = sum + matrixA[row][k]*matrixB[k][col];
        }
        product[row][col] = sum;
      }
    }
    return product;
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
    int[][] A = {{1,2}, {3,4}, {5,6}};
    int[][] B = {{1,2,3}, {4,5,6}};
    printMatrix(product(A, B));
  }

}
