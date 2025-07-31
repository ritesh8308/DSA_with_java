

public class Create_Array{
    public static void main(String args[]) {
        int [] marks = new int [3];
        marks[0] = 90;
        marks[1] = 67;
        marks[2] = 89;

        // int [] marks = {90, 67, 89};

        for (int i =0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
        //System.out.println(Arrays.toString(marks));
    }
}