package presentation.mainui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class User_start extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/user/user/UserUI.fxml"));
			Scene scene = new Scene(root, 600, 400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			User_controller.stage = primaryStage;
			primaryStage.setScene(scene);
			primaryStage.setTitle("�ͻ�������");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		launch(args);
//	}
}
