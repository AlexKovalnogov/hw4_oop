import com.qa.homework.Service;
import com.qa.homework.convertToJson.ConvertModelToJson;
import com.qa.homework.models.Administrator;
import com.qa.homework.models.Director;
import com.qa.homework.models.Serviceman;


public class GoToService {


    public void setData() {
        Administrator administrator1 = new Administrator("A1", "A1", "1", 500, "administrator");
        Serviceman firstServiceman = new Serviceman("s1", "s1", "3", 1000, "Serviceman");
        Director director = new Director("D1", "D1", "5", 2000, "director");

        Service.listOfEmployees.add(administrator1);
        Service.listOfEmployees.add(firstServiceman);
        Service.listOfEmployees.add(director);
        new ConvertModelToJson().createJsonListOfEmployee(Service.listOfEmployees);
    }


}
