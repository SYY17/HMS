package presentation.mainui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Hotel_start extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/user/hotel/HotelUI.fxml"));
			Scene scene = new Scene(root, 600, 400);
			scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
			Hotel_controller.stage = primaryStage;
			primaryStage.setScene(scene);
			primaryStage.setTitle("酒店工作人员主界面");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		launch(args);
//	}
}
