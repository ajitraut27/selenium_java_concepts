package JavaPrograms;

import java.util.HashMap;

public class Count_Occurrence_Of_Words_In_String {
    public static void main(String[] args) {
        String str = "My Name is Ajit. Ajit is My Name. Hi ajit";
        System.out.println(str);

        String[] strSplit = str.split(" ");

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < strSplit.length; i++) {
            if (hm.containsKey(strSplit[i])){
                int count = hm.get(strSplit[i]);
                hm.put(strSplit[i], count + 1);
            }else {
                hm.put(strSplit[i], 1);
            }
        }
        System.out.println(hm);
    }
}
