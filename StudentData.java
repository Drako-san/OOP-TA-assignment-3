public class StudentData {
    String name;
    String colour;
    String id;

    public StudentData(String n, String c, String i){
        name = n;
        colour = c;
        id = i;
    }

    public void printString(){
        String printString ="| " + id + " | " + name + " | " + colour + " | ";
        System.out.println(printString);
    }
}