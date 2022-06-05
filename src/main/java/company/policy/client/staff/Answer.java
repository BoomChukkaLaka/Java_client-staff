package company.policy.client.staff;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.swing.event.AncestorEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Answer implements Initializable {



    public Stage getStage( String correct1, String yours){
            Stage stage=new Stage();
            AnchorPane anchorPane=new AnchorPane();
            anchorPane.setPrefHeight(153);
            anchorPane.setPrefWidth(420);
            TextField textField=new TextField();
            textField.setPrefHeight(26);
            textField.setText(yours);
            textField.setLayoutY(38);
            textField.setLayoutX(142);
            textField.setPrefWidth(218);
            TextField textField1=new TextField();
            textField1.setPrefHeight(26);
            textField1.setPrefWidth(218);
            textField1.setText(correct1);
            textField1.setLayoutY(95);
            textField1.setLayoutX(142);
            Label label=new Label("Your answer");
            label.setPrefHeight(17);
            label.setLayoutY(43);
            label.setLayoutX(32);
            label.setPrefWidth(82);
            Label label1=new Label("Correct Answer");
            label1.setPrefHeight(17);
            label1.setPrefWidth(106);
            label1.setLayoutX(24);
            label1.setLayoutY(100);
            anchorPane.getChildren().addAll(label,textField,label1,textField1);
            label.setStyle("-fx-text-fill: #ffffff;");
            label1.setStyle("-fx-text-fill: #ffffff;");
            anchorPane.setStyle("-fx-background-color: #241313;");
            Scene scene = new Scene(anchorPane,435,160);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
            PauseTransition delay = new PauseTransition(Duration.seconds(5));
            delay.setOnFinished( event -> stage.close() );
            delay.play();

        return stage;


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
