package JavaPrograms;

import java.util.HashMap;

public class Count_Occurrence_Of_Characters_In_String {

    public static void main(String[] args){
        String str = "ajit ramdas raut";
        System.out.println(str);

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(hm.containsKey(str.charAt(i))){
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), count+1);
            }else {
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(hm);
    }
}
