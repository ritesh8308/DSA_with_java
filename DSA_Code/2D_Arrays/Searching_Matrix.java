import java.util.*; 
 
public class Searching_Matrix { 
   public static void main(String args[]) { 
       Scanner sc = new Scanner(System.in); 
       int rows = sc.nextInt(); 
       int cols = sc.nextInt(); 
 
       int[][] numbers = new int[rows][cols]; 
 
       //input 
       //rows 
       for(int i=0; i<rows; i++) { 
           //columns 
           for(int j=0; j<cols; j++) { 
               numbers[i][j] = sc.nextInt(); 
           } 
       } 
    
       System.out.print("Enter an element to search: ");
       int x = sc.nextInt(); 

       boolean found = false;
       for(int i=0; i<rows; i++) { 

           for(int j=0; j<cols; j++) { 
               //compare with x 

               if(numbers[i][j] == x) { 
                   System.out.println(x+" found at location (" + i + ", " + j + ")"); 
                   found = true;
               }

               
           }
               
       }

       if(!found) {
        System.out.println("Element not found!");
       } 
 
      
 
   } 
}