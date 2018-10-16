package notepad_1_gav;

import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        Map<String, String> translation = new HashMap<>();
        translation.put("one", "один");
        translation.put("home", "дом");
        translation.put("mouse", "мышь");

        System.out.println(translation.get("home"));
    }
}
