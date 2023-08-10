package static_method;

public class Student {
    private int stt;
    private String name;
    private static String college = "HN";
    Student(int STT, String a) {
        this.stt = STT;
        this.name = a;
    }
    static void changeCollege() {
        college = "CodeGyn";
    }
    void display() {
        System.out.println(stt +" "+ name + " " + college);
    }
}

