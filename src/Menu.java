import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Management sm = new Management();
        String id;
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display a student by ID");
            System.out.println("4. Delete a student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayListStudent();
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    id = sc.next();
                    sm.display(sm.getStudent(id));
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    id = sc.next();
                    sm.deleteStudent(sm.getStudent(id));
                    break;
                default:
                    System.out.println("Invalid choice, only choice 0-4");
            }
        }
    }
}
