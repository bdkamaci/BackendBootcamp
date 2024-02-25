package java101.studentInformationSystem;

public class Student {
    String name, stNum;
    int classes;
    Course math;
    Course phy;
    Course chem;
    double average;
    double mathAverage;
    double phyAverage;
    double chemAverage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course phy, Course chem) {
        this.name = name;
        this.classes = classes;
        this.stNum = stuNo;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int phy, int chem, int mathOral, int phyOral, int chemOral) {

        if (math >= 0 && math <= 100 && mathOral >= 0 && mathOral <= 100) {
            this.math.note = math;
            this.math.oral = mathOral;
        }

        if (phy >= 0 && phy <= 100 && phyOral >= 0 && phyOral <= 100) {
            this.phy.note = phy;
            this.phy.oral = phyOral;
        }

        if (chem >= 0 && chem <= 100 && chemOral >= 0 && chemOral <= 100) {
            this.chem.note = chem;
            this.chem.oral = chemOral;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.phy.note == 0 || this.chem.note == 0 || this.math.oral == 0 || this.phy.oral == 0 || this.chem.oral == 0) {
            System.out.println("Notes not entered completely!");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAvarage() {
        this.mathAverage = ((this.math.note * 0.8) + (this.math.oral * 0.2));
        this.phyAverage = ((this.phy.note * 0.8) + (this.phy.oral * 0.2));
        this.chemAverage = ((this.chem.note * 0.8) + (this.chem.oral * 0.2));
        this.average = (this.mathAverage + this.phyAverage + this.chemAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + this.mathAverage);
        System.out.println("Physics Grade : " + this.phyAverage);
        System.out.println("Chemistry Grade : " + this.chemAverage);
    }

}