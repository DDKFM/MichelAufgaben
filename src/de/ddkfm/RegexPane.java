package de.ddkfm;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RegexPane extends BorderPane {

    private TextArea textArea = new TextArea();
    private Button replaceRegex = new Button("Variablen ersetzen");
    public RegexPane() {
        this.setCenter(this.textArea);
        replaceRegex.setAlignment(Pos.CENTER);
        this.setBottom(replaceRegex);
        replaceRegex.setOnAction(event -> {

            Map<String, Object> variables = new HashMap<>();
            //Variables
            variables.put("CLASS", "BG132");
            variables.put("YEAR", 2017);
            variables.put("RANDOM_NUMBER", null);

            //TODO: implement variables
            //variables.put("USER_HOME", )//home directory of the current user
            //variables.put("CURRENT_TIME", );
            //variables.put("USERNAME", );

            String replacedText = RegexExample.replaceVariables(textArea.getText(), variables);
            this.textArea.setText(replacedText);
        });
    }

}
