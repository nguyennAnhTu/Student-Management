import java.util.HashMap;
import java.util.Map;

class Management implements Manage<Student> {
    private static Map<String, Student> students = new HashMap<>();
    //Abstraction, List is an interface
    //private static int numOfStudents;

    public static boolean existedId(String id) {
        return students.containsKey(id);
    }

    @Override
    public void add(Student student) {
        if (!existedId(student.getId())) {
            students.put(student.getId(), student);
        }
    }

    @Override
    public void display(Student student){
        if (student == null) System.out.println("Student with Id is not exist");
        else
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getGender());
    }

    public void displayListStudent(){
        for (Student student : students.values()) {
            display(student);
        }
    }

    public Student getStudent (String id) {
        return students.get(id);
    }

    @Override
    public void delete(Student student) {
        if (student == null) System.out.println("Student with Id is not exist");
        else
            students.remove(student.getId());
    }
}