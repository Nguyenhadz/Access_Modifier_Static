package static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.changeCollege();
        Student s1 = new Student(1, "Ha");
        Student s2 = new Student(2, "Manh");
        Student s3 = new Student(3, "Dat");
        s1.display();
        s2.display();
        s3.display();
    }
}