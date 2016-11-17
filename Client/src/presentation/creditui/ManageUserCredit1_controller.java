package presentation.creditui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;

public class ManageUserCredit1_controller {

	public static Stage stage;

	@FXML
	private void onLogout(ActionEvent event) throws IOException {
		new LogFrame().start(stage);
	}
}