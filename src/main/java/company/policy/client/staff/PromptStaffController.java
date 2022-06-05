package company.policy.client.staff;

import company.policy.client.staff.QuestionViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PromptStaffController {

    public Button btnExit;
    public Button btnNo;

    public Stage getStage(String fxmlPath){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        Stage stage=new Stage();
        try {

            Scene scene = new Scene(fxmlLoader.load());
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stage;


    }

    public void closeApp(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
        QuestionViewController quiz=new QuestionViewController();
        quiz.stop();
        System.exit(0);
    }

    public void doNothing(ActionEvent actionEvent) {
        Stage stage = (Stage) btnNo.getScene().getWindow();
        stage.close();
    }
}
