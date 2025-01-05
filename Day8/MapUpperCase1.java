package Day8;

import java.util.stream.Stream;

public class MapUpperCase1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using map() method
        Stream<String> upperCaseNames = names.map(String::toUpperCase);

        // Print the result
        upperCaseNames.forEach(System.out::println);
    }
}


