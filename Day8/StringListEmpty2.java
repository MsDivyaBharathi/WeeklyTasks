package Day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListEmpty2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "bc", "efg", "abcd", "", "jkl");

        // Filter out empty strings using filter() method
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
        //Find the index of the empty string
        int emptyStringIndex = strings.indexOf("");

        // Check if the empty string is present and print the result
        if (emptyStringIndex != -1) {
            System.out.println("Empty string is present at index: " + emptyStringIndex);
        } else {
            System.out.println("Empty string is not present in the list.");
    }
}}
