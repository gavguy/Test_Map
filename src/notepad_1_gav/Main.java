package notepad_1_gav;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
       // Map<String, String> translation = new HashMap<>();
        Map<String, String> translation = new LinkedHashMap<>(); //svjazanij hasmap- porjadok elementov sohranjon
        translation.put("one", "один");
        translation.put("home", "дом");
        translation.put("mouse", "мышь");

        System.out.println(translation.get("home"));

        for (String k : translation.keySet()) {
            System.out.printf("%s -> %s\n", k, translation.get(k));  //%s vivesti stroku \n na novuju stroku perevod
        }








    }
}
