package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_StringType {
    public static void main(String[] args) {
        List<String> strArrList = new ArrayList<>(Arrays.asList("aj", "rj", "dj"));
        System.out.println(strArrList);

        Iterator<String> itr = strArrList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //or

        for(int i = 0; i < strArrList.size(); i++){
            System.out.println(strArrList.get(i));
        }

    }
}
