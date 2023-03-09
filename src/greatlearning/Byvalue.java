package greatlearning;

public class Byvalue {
    public static void main(String[] args) {
        Byvalue s1= new Byvalue();
        System.out.println("before any change in marks"+s1.marks);
        s1.subject(88);
        System.out.println("after passing the value"+s1.marks);
    }
    int marks=99;
    void subject(int marks){
        marks=marks-16;
        System.out.println(marks);
    }
}
