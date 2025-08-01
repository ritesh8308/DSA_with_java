public class Parse_Int { 
public static void main(String args[]) { 
String str = "123"; 
int number = Integer.parseInt(str); 
System.out.println("Datatype of String \""  + str  + "\" is converted to " +((Object)number).getClass().getSimpleName()); 
  
   }

}