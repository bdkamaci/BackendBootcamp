package java101.studentInformationSystem;

public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MATH101", "MATH");
        Course phy = new Course("Physics", "PHYS101", "PHYS");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Jane Doe 1", "90550000000", "MATH");
        Teacher t2 = new Teacher("Jane Doe 2", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Jane Doe 3", "90550000002", "CHEM");

        math.addTeacher(t1);
        phy.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Student 1", 4, "140144015", math, phy, chem);
        s1.addBulkExamNote(50,20,40, 70, 50, 60);
        s1.isPass();

        Student s2 = new Student("Student 2", 4, "2211133", math, phy, chem);
        s2.addBulkExamNote(100,50,40, 90, 60, 50);
        s2.isPass();

        Student s3 = new Student("Student 3", 4, "221121312", math, phy, chem);
        s3.addBulkExamNote(50,20,40, 60, 40, 60);
        s3.isPass();

    }
}