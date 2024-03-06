package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_String_ArrayList_Elements_Ascending {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("mac", "windows", "linux", "unix"));

        System.out.println("Before sort: " + stringList);

        Collections.sort(stringList);
        System.out.println("After sort: " + stringList);
    }
}
