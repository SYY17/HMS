package presentation.userui.user;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DetailedInformation_start extends Application{

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/user/user/常用信息.fxml"));
			Scene scene = new Scene(root, 800, 600);
			DetailedInformation_controller.stage=primaryStage;
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setScene(scene);
			primaryStage.setTitle("酒店管理系统");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
