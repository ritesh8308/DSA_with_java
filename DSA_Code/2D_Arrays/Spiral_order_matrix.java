import java.util.*;
public class Spiral_order_matrix {
    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();

          int matrix [][] = new int [n][m];

          for (int i=0; i<n; i++) {

            for (int j=0; j<m; j++) {

                matrix [i][j] = sc.nextInt();
            }

          }

       System.out.println("The spiral order of Matrix is: ");
       int rowStart = 0;
       int rowEnd = n-1;
       int colStart = 0;
       int colEnd = m-1;


       // To print spiral order of matrix
       while(rowStart <= rowEnd && colStart <= colEnd) {
            
       //1
       for (int col=colStart;  col <= colEnd; col++) {
        System.out.print(matrix[rowStart][col] + " ");

       }
       rowStart++;

       
       //2
       for (int row=rowStart; row<=rowEnd; row++) {
        System.out.print(matrix[row][colEnd] + " ");
       }
       colEnd--;



      //29 is printed twice 

      /*Let’s make it even simpler:

Your while loop checks if there are rows and columns left before starting a round.
But inside the loop, after each step, you change the boundaries (rowStart, rowEnd, colStart, colEnd).
Sometimes, after changing boundaries, there are no rows or columns left for the next step, but your code still prints them.
This causes the center element to be printed twice in odd-sized matrices.

Solution:
Add an if check before steps 3 and 4 to make sure there are still rows/columns left to print.
*/
       //3
       if(rowStart <= rowEnd){
       for (int col=colEnd; col>=colStart; col--) {
        System.out.print(matrix[rowEnd][col]+ " ");
       }
       rowEnd--;
       }


       //4
       if (colStart <= colEnd){
       for (int row=rowEnd; row>=rowStart; row--) {
        System.out.print(matrix[row][colStart] + " ");
       }
       colStart++;
       }

       System.out.println();


       }
    }
}