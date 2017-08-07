package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Programming on 6-8-2017.
 */
public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> langauges = new HashMap<>();

        langauges.put("Python", "An interpreted, object-oriented, highlevel programming langauge with dynamic semantics");
        langauges.put("Algol", "an algorithmic langauge");
        langauges.put("BASIC", "Beginner All Purpose Symbolic Instruction Code");
        langauges.put("Lisp", "Therein lies madness");


        if (!langauges.containsKey("Java")) {
            langauges.put("Java", "Poop");
        } else {
            System.out.println("Java already in map!");
        }


        System.out.println(langauges.get("Java"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        for (String key: langauges.keySet()) {
            System.out.printf("%s: %s\n", key, langauges.get(key));
        }
    }
}
