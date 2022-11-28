package department;

public class DepartmentOfBugoltery extends HumanResourcesDepartment {
    int premium;
    int fine;
    boolean fines;

    public void checkFines() {


        if (efficiencyRatio > 1.0) {
            premium = 500;
            System.out.println(premium);
        } else if (efficiencyRatio == 1.0) {
            premium = 0;
            fine = 0;
            fines = false;
            System.out.println(premium);
            System.out.println(fine);
            System.out.println(fines);

        } else {
            premium = 0;
            fine = 1000;
            fines = true;
            System.out.println(premium);
            System.out.println(fine);
            System.out.println(fines);
        }

    }

    public void weCountTheSalary() {
        countSalary();
        checkFines();

        if (fines == true) {
            salary = salary - fine;
        } else {
            salary = salary + premium;
        }


    }
}

