import java.util.Scanner;

public class Main {

    private static final int STUDENT_NUMBER = 10;

    public static void main(String[] args) {
        System.out.println(String.format("%nYou will enter %s names.", STUDENT_NUMBER));
        String[] names = getInputNames();
        printNames(names);
        return;
    }

    /**
     * Get a list of names based on user terminal input.
     * 
     * @return String[] of names
     */
    private static String[] getInputNames() {
        String[] names = new String[STUDENT_NUMBER];
        int studentsAdded = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (studentsAdded < names.length) {
                try {
                    System.out.println("Enter student's name:");
                    String newStudent = scanner.nextLine();
                    if (newStudent.isBlank())
                        throw new Exception("Student name cannot be blank.\n");
                    names[studentsAdded] = newStudent;
                    studentsAdded++;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return names;
    }

    /**
     * Prints the list of names
     * 
     * @param names
     */
    private static void printNames(final String[] names) {
        System.out.println("\nYou have entered the following names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
