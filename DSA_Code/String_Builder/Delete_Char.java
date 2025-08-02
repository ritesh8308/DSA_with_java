public class Delete_Char { 
   public static void main(String args[]) { 
     StringBuilder sb = new StringBuilder("tony"); 
     //Insert char 
     sb.insert(0, 'S'); 
     System.out.println(sb); 
 
 //delete char 
     sb.delete(1,2); 
     System.out.println(sb); 
   } 
}