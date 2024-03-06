package pojo_serialization_deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class serializationAndDeserialization_JsonObject {

    @Test
    public void createJsonObjectFromEmpClassObj() throws JsonProcessingException {
        //****************** Convert Class object to Json object (Serialization) ******************
        pojo_employee emp = new pojo_employee();

        emp.setFirstName("ajit");
        emp.setLastName("raut");
        emp.setAge(30);
        emp.setGender("male");
        emp.setSalary(10000.00);

        //convert employee object to json object

        ObjectMapper objMap = new ObjectMapper();
        String empJson = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);

        System.out.println(empJson);

        //****************** Convert Json object to Class object (Deserialization) ******************

        pojo_employee emp1 = objMap.readValue(empJson, pojo_employee.class);
        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getGender());
        System.out.println(emp1.getSalary());
    }
}
