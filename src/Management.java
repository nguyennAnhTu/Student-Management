import java.util.ArrayList;
import java.util.List;

public class Management {
    private static List<Student> students = new ArrayList<>();
    //Abstraction, List is an interface
    private static int numOfStudents;

    public static boolean existedId(String id) {
        for (int i = 0; i < numOfStudents; i++) {
            if (id.equals(students.get(i).getId())){
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student) {
        students.add(student);
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