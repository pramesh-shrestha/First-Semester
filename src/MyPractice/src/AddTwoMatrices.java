public class AddTwoMatrices
{
  public static void main(String[] args)
  {
    /*creating two arrays(multidimensional array)-the outer array has 2 elements
    which consist of inner array with 3 elements each*/
    int[][] matrix1 = {{0,2,3},{1,4,5}};
    int[][] matrix2 = {{0,2,3},{1,4,5}};
    //initializing sum
    int[][] sum = {{0,0,0},{0,0,0}};

    //looping the outer array
    for(int i = 0; i < matrix1.length; i++) {
      for(int j = 0 ; j < matrix1[i].length; j++ ) {
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
        //printing on the same row
        System.out.print(sum[i][j] + " ");
      }
      //new line
      System.out.println();
    }
  }
}
