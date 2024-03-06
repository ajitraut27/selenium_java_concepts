package pojo_serialization_deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class create_Json_Array {

    @Test
    public void createJsonArrayPojo() throws JsonProcessingException {
        pojo_employee emp1 = new pojo_employee();
        emp1.setFirstName("ajit");
        emp1.setLastName("raut");
        emp1.setAge(30);
        emp1.setGender("male");
        emp1.setSalary(10000.00);

        pojo_employee emp2 = new pojo_employee();
        emp2.setFirstName("a1");
        emp2.setLastName("r1");
        emp2.setAge(34);
        emp2.setGender("female");
        emp2.setSalary(12000.00);

        pojo_employee emp3 = new pojo_employee();
        emp3.setFirstName("aa1");
        emp3.setLastName("ra1");
        emp3.setAge(46);
        emp3.setGender("male");
        emp3.setSalary(20000.00);

        List<pojo_employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        ObjectMapper objMap = new ObjectMapper();

        String jsonArray = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(empList);

        System.out.println(jsonArray);

    }
}
