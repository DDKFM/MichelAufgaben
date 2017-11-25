package de.ddkfm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RegexCLI {
    public static void main(String[] args) {
        File exampleFile = new File("example");
        String text = "";
        try {
            text = new String(Files.readAllBytes(exampleFile.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Einzulesener Text: ");
        System.out.println(text);

        Map<String, Object> variables = new HashMap<>();
        //Variables
        variables.put("CLASS", "BG132");
        variables.put("YEAR", 2017);
        variables.put("RANDOM_NUMBER", null);

        //TODO: implement variables
        //variables.put("USER_HOME", );//home directory of the current user
        //variables.put("CURRENT_TIME", );
        //variables.put("USERNAME", );

        String output = RegexExample.replaceVariables(text, variables);
        System.out.println("Ausgabetext: ");
        System.out.println(output);
    }
}
