import org.apache.log4j.Logger;

public class Director extends Employee{

    private Logger logger= Logger.getLogger(Director.class);

    public void changeLocationOfServiceCenter() {
        System.out.print("changeLocationOfServiceCenter");
    }

    public void hireEmployee() {
        System.out.println("hireEmployee");
    }

    public void fireEmployee() {
        System.out.println("fireEmployee");
    }

    public void payTax() {
        System.out.print("payTax");
    }

    public void paySalary() {
        System.out.print("paySalary");
    }


    public void getListOfEmployees() {
        System.out.println("getListOfEmployees");
    }

    public void increaseSalaryForEmployees() {
        System.out.println("increaseSalaryForEmployees");
    }

    public void getRevenues() {
        System.out.println("getRevenues");
    }



}
