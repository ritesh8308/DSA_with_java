import java.util.Scanner;


public class Array_Max_Min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers [] = new int[size];

        //input 

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;  // -2,147,483,648
        int min = Integer.MAX_VALUE;  // 2,147,483,648
        
        
        
         /*  🔍 Purpose in Context
This line appears in a program that finds the maximum and minimum values in an array of integers entered by the user.

🧠 What It Means
Integer.MIN_VALUE: This is the smallest possible value an int can hold in Java, which is -2,147,483,648.

Integer.MAX_VALUE: This is the largest possible value an int can hold in Java, which is 2,147,483,647.

By initializing:

max to the lowest possible value, any number in the array will be greater, so it can be updated correctly.

min to the highest possible value, any number in the array will be smaller, so it can be updated correctly.
*/
 

     for (int i=0; i<numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }

        if (numbers[i] > max) {
            max = numbers[i];
        }

     }

      System.out.println("Largest number is : " + max); 
       System.out.println("Smallest number is : " + min); 
    
    }

}