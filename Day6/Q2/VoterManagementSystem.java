package Day6.Q2;

public class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Alice", 20);
            System.out.println("Voter created: " + voter1.getName());
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter voter2 = new Voter(2, "Bob", 16);
            System.out.println("Voter created: " + voter2.getName());
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
