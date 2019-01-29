import InstanceModels.*;

public class GoToService {



    public void setData(){
        Administrator administrator1 = new Administrator("A1", "A1", "1", 500);
        Employee administrator2 = new Administrator("A2", "A2", "2", 600);
        Serviceman firstServiceman = new Serviceman("s1", "s1", "3", 1000);
        Serviceman secondServiceman = new Serviceman("s2", "s2", "4", 1200);
        Director director  = new Director("D1", "D1", "5", 2000);
        Employee employee = new Employee();

        employee.listOfEmployees.add(administrator1);
       // employee.listOfEmployees.add(administrator2);
        employee.listOfEmployees.add(firstServiceman);
       // employee.listOfEmployees.add(secondServiceman);
        employee.listOfEmployees.add(director);
    }




}
