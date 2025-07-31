import java.util.*;

public class Array_IP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums [] = new int[size];

        for (int i=0; i<size; i++) {
            nums[i] = sc.nextInt ();
        }

        //print the numbers in array
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}