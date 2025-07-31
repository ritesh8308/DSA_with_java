import java.util.*; 
 
public class Matrix { 
   public static void main(String args[]) { 
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter number of rows: ");
       int rows = sc.nextInt();
        System.out.print("Enter number of columns: "); 
       int cols = sc.nextInt(); 
 
       int[][] numbers = new int[rows][cols]; 
 
       //input 

       //rows 
       for(int i=0; i<rows; i++) { 
           //columns 
           for(int j=0; j<cols; j++) { 
            System.out.print("Enter number:"+"("+ i + "," + j + ")");
               numbers[i][j] = sc.nextInt(); 
           } 
       } 
 
        //output

        //rows
       for(int i=0; i<rows; i++) { 
        //columns
           for(int j=0; j<cols; j++) { 
                   System.out.print(numbers[i][j]+" "); 
               } 
               System.out.println(); 
           } 
   } 
}