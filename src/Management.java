import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    private List<Student> students;
    //Abstraction, List is an interface
    private int numOfStudents;

    public Management() {
        students = new ArrayList<>();
        numOfStudents = 0;
    }

    private int existedId(String id) {
        for (int i = 0; i < numOfStudents; i++) {
            if (id.equals(students.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        String id;
        String name;
        int age;
        String gender;
        while (true) {
            System.out.print("Enter student id: ");
            id = sc.nextLine();
            if (existedId(id) == -1) break;
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
        students.add(newStudent);
        System.out.println();
        numOfStudents++;
    }

    public void displayListStudent(){
        for (Student student : students) {
            display(student);
        }
    }

    public Student getStudent (String id) {
        for (Student student : students) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void display(Student student){
        if (student == null) System.out.println("Student with Id is not exist");
        else
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getGender());
    }

    public void deleteStudent(Student student) {
        if (student == null) System.out.println("Student with Id is not exist");
        else
            students.remove(student);
    }
}