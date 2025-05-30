import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<Studentt> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Studentt student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + className);
    }

    public void removeStudent(Studentt student) {
        students.remove(student);
        System.out.println(student.getName() + " removed from " + className);
    }

    public void displayStudents() {
        System.out.println("Students in " + className + ":");
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            for (Studentt s : students) {
                s.displayInfo();
            }
        }
    }

    public void transferStudent(Studentt student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println("Transferred " + student.getName() + " to " + newClassroom.className);
        } else {
            System.out.println("Student not found in " + className);
        }
    }
}
