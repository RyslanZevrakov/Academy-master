
package department;
import java.util.Scanner;

public class Department {


    public int idEmployee;
    public String nameOfDepartment;
    public int amountOfWorkers;

    public double efficiencyRatio;
    public double salary;
    Scanner myObj = new Scanner(System.in);
    double standardEfficiencyValue = 1.0;
    public void countSalary(){
        System.out.println("Input salary");
        salary=myObj.nextDouble();
        System.out.println("Input efficiencyRatio");
        efficiencyRatio=myObj.nextDouble();
        if (efficiencyRatio > standardEfficiencyValue) {
            salary = salary *2;
            System.out.println(salary);

        } else if (efficiencyRatio < standardEfficiencyValue) {
            salary = salary * 0.8;


            System.out.println(salary);

        } else {
            salary = salary * 1.2;
            System.out.println(salary);

        }
    }
}
