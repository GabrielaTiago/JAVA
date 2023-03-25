package systemproperties;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.util.Date;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PropertiesController {

    @FXML
    private Button timeButton;

    @FXML
    private Label timeLabel;

    @FXML
    private Button languageButton;

    @FXML
    private Label languageLabel;

    @FXML
    private Button screenButton;

    @FXML
    private Label screenLabel;

    @FXML
    void displayTime(ActionEvent event) {
        Date currentTime = new Date();
        timeLabel.setText(currentTime.toString());
    }

    @FXML
    void displayLanguage(ActionEvent event) {
        Locale languageLocale = Locale.getDefault();
        String language = languageLocale.getDisplayLanguage();
        languageLabel.setText("O idioma do seu sistema está em " + language);
    }

    @FXML
    void displayScreen(ActionEvent event) {
        Toolkit properties = Toolkit.getDefaultToolkit();
        Dimension dimension = properties.getScreenSize();
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight();

        screenLabel.setText("Sua tela tem resolução de: " + width + " x " + height);
    }
}
