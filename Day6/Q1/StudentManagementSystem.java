package Day6.Q1;


    public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "JohnDoe", 20, "Computer Science");
            System.out.println("Student created: " + student1.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student2 = new Student(2, "Jane@Doe", 22, "Mathematics");
            System.out.println("Student created: " + student2.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

