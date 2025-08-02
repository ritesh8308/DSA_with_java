import java.util.*;

public class String_Length {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String noSpaces = fullName.replace(" " ,"");
        System.out.println("Length of fullName (excluding spaces is)" + noSpaces.length());
    }
}