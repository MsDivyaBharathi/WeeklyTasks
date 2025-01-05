package Day2;

public class Pattern {
    public static void main(String[] args) {
        int j = 5; // Value of j
        int k = 5; // Value of k
 
        // Outer loop for rows
        for (int i = 1; i <= k; i++) {
            // Inner loop for printing numbers
            for (int m = k; m >= 1; m--) {
                if (m > j) {
                    System.out.print(m);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println(); // Move to the next line after each row
            j--; // Decrement j for the next row
        }
    }
}
