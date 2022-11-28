
package department;
import java.util.ArrayList;
public class HumanResourcesDepartment extends Department{
    ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
    public boolean isAnEmployee = false;
    public String nameOfEmployee;
    public String surnameOfEmployee;

    public void checkWorker() {
        if ((idEmployee != 0) && (!nameOfEmployee.isEmpty())
                && (!surnameOfEmployee.isEmpty())) {
            isAnEmployee = true;
            System.out.println(isAnEmployee);
        }
        else {
            isAnEmployee = false;
            System.out.println(isAnEmployee);
        }
    }
}
