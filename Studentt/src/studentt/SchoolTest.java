public class SchoolTest {
    public static void main(String[] args) {
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");

        Studentt s1 = new Studentt("Alice", 101);
        Studentt s2 = new Studentt("Bob", 102);
        Studentt s3 = new Studentt("Charlie", 103);

        classA.addStudent(s1);
        classA.addStudent(s2);
        classA.addStudent(s3);

        System.out.println("\nBefore Transfer:");
        classA.displayStudents();
        classB.displayStudents();

        classA.transferStudent(s2, classB);

        System.out.println("\nAfter Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}
