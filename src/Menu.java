import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Management management = new Management();
        String Id;
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display a student by ID");
            System.out.println("4. Delete a student by ID");
            System.out.println("5. Update a student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Student newStudent = new Student();
                    String id;
                    String name;
                    int age;
                    String gender;
                    while (true) {
                        System.out.print("Enter student id: ");
                        id = sc.nextLine();
                        if (!Management.existedId(id)) break;
                        else {
                            System.out.println("Id already exists!");
                        }
                    }
                    System.out.print("Enter student name: ");
                    name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student gender: ");
                    gender = sc.nextLine();
                    newStudent.setId(id);
                    newStudent.setName(name);
                    newStudent.setAge(age);
                    newStudent.setGender(gender);
                    System.out.println();
                    management.add(newStudent);
                    break;
                case 2:
                    management.displayListStudent();
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    Id = sc.nextLine();
                    management.display(Id);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    Id = sc.nextLine();
                    management.delete(Id);
                    break;
                case 5:
                    System.out.print("Enter student ID: ");
                    Id = sc.nextLine();
                    management.update(Id);
                    break;
                default:
                    System.out.println("Invalid choice, only choice 0-4");
            }
        }
    }
}
