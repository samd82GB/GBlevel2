package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Date;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField texField;


    @FXML
    public void send(ActionEvent actionEvent) {
       textArea.appendText(new Date().toString()+":   "  + texField.getText()+"\n"); //вывод текста ввода с датой отправления
       texField.clear();
       texField.requestFocus();
    }
}
