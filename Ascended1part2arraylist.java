import java.util.*;

public class Ascended1part2arraylist {
    public static void main(String args[]){
        ArrayList<StudentData> students = new ArrayList<StudentData>();
        students.add(new StudentData("Edsel Putra Harren", "Red Velvet", "2440081942"));
        students.add(new StudentData("Jason Jeremy Wijadi", "White", "2440077301"));
        students.add(new StudentData("Monique Senjaya", "Blue", "2440061285"));
        students.add(new StudentData("Morris Kim", "Violet", "2440074174"));
        students.add(new StudentData("Ardelia Shaula Araminta", "Black", "2440065163"));

        StudentData key;
        int y;
      
        for(int x = 1; x < students.size(); x++){
            key = students.get(x);
            y = x - 1;
            while(y >= 0 && students.get(x - 1).name.compareTo(key.name) > 0){
                students.set(y+1, students.get(y)); 
                y--;
            }
            students.set(y+1, key);
        }
    
        System.out.println("Sorted by name:");
        System.out.println("=============================================");
        for(StudentData student: students){
            student.printString();
        }
        System.out.println("=============================================");
        System.out.println();

        for(int x = 1; x < students.size(); x++){
            key = students.get(x);
            y = x - 1;
            while(y >= 0 && students.get(x - 1).colour.compareTo(key.colour) > 0){
                students.set(y+1, students.get(y)); 
                y--;
            }
            students.set(y+1, key);
        }
        //print
        System.out.println("Sorted by colour:");
        System.out.println("=============================================");
        for(StudentData student: students){
            student.printString();
        }
        System.out.println("=============================================");
    }
}