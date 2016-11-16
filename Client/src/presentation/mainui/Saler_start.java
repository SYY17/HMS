package presentation.mainui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Saler_start extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/user/saler/SalerUI.fxml"));
			Scene scene = new Scene(root, 800, 600);
			 scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
			Saler_controller.stage = primaryStage;
			primaryStage.setScene(scene);
			primaryStage.setTitle("网站营销人员");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		launch(args);
//	}
}
