import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Management implements Manage {
    private static Map<String, Student> students = new HashMap<>();
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
    public void display(String id){
        if (!existedId(id)) System.out.println("Student with Id is not exist");
        else{
            Student student = students.get(id);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getGender());
        }
    }

    public void displayListStudent(){
        for (String studentId : students.keySet()) {
            display(studentId);
        }
    }

    @Override
    public void update(String id) {
        if (!existedId(id)) System.out.println("Student with Id is not exist");
        else {
            Scanner sc = new Scanner(System.in);
            String name;
            int age;
            String gender;
            Student student = students.get(id);
            System.out.print("Enter new name: ");
            name = sc.nextLine();
            System.out.print("Enter new age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new gender: ");
            gender = sc.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setGender(gender);
            students.put(student.getId(), student);
            System.out.println("Student with Id: " + id + " updated");
        }
    }

    @Override
    public void delete(String id) {
        if (!existedId(id)) System.out.println("Student with Id is not exist");
        else
            students.remove(id);
    }
}