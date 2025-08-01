import java.util.*;

public class Strings {
    public  static void main(String args[]) {
          
          // declaring a string
          String last_name = "Mane";

          Scanner sc = new Scanner(System.in);
          String first_name = sc.next();
          
          String full_name = first_name + " " + last_name;
          System.out.println(full_name);
          System.out.println("Length of full name is: "+ full_name.length());

          for (int i=0; i<full_name.length(); i++) {
            System.out.println(i + " " + full_name.charAt(i));
          }
    }
}