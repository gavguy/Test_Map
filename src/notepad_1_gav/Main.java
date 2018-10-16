package notepad_1_gav;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        // Map<String, String> translation = new HashMap<>();
        // Map<String, String> translation = new TreeMap<>();  //
         Map<String, String> translation
                 = new TreeMap<>(Comparator.reverseOrder());  // sortirovka v drugom porjadke
    //    Map<String, String> translation = new LinkedHashMap<>(); //svjazanij hasmap- porjadok elementov sohranjon
        translation.put("one", "один");
        translation.put("two", "два");
        translation.put("home", "дом");
        translation.put("mouse", "мышь");
        translation.put("mouse", "мышь");
        translation.put("mouse", "мышь");
        translation.put("terrible", "знойно");

        System.out.println(
                translation.containsKey("home"));
        System.out.println(
                translation.size());


        System.out.println(translation.get("home"));

        for (String k : translation.keySet()) {
            System.out.printf("%s -> %s\n", k, translation.get(k));  //%s vivesti stroku \n na novuju stroku perevod
        }
        //
        //remove
//

    }
}
