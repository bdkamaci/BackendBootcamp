package java101.salaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        double taxPercent;
        double tax;
        if (this.salary > 1000) {
            taxPercent = 0.03;
        } else {
            taxPercent = 0.0;
        }
        tax = (this.salary * taxPercent);
        return tax;
    }


    public int bonus() {
        int bonus, extraWorkHours;
        if(this.workHours > 40) {
            extraWorkHours = this.workHours - 40;
        } else {
            extraWorkHours = 0;
        }
        bonus = extraWorkHours * 30;
        return bonus;
    }

    public double raiseSalary() {
        int currentYear = 2021, totalYears;
        double raisePercentage, raise;
        totalYears = currentYear - this.hireYear;

        if(totalYears < 10) {
            raisePercentage = 0.05;
        } else if (totalYears >= 9 && totalYears < 20) {
            raisePercentage = 0.1;
        } else if (totalYears > 19) {
            raisePercentage = 0.15;
        } else {
            raisePercentage = 0.0;
        }
        raise = (this.salary * raisePercentage);
        return raise;
    }

    public void printEmployee(){
        System.out.println("=========================");
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary Raise : " + raiseSalary());
        System.out.println("Income Including Bonus and Tax : " + (this.salary + bonus() - tax()));
        System.out.println("Net Income : " + (this.salary + bonus() - tax() + raiseSalary()));
    }

}

