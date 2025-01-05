package Day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherAlphabet3 {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Amanda", "David", "Anna", "Eve", "Albert", "Frank");

        // Filter students whose names start with "A" using Stream API and lambda expression
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}

