package presentation.orderui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;
import presentation.mainui.Manager_start;
import presentation.mainui.Saler_start;

public class ManageAbnormalOrder1_controller {

	public static Stage stage;

	@FXML
	private void onLogout(ActionEvent event) throws IOException {
		new LogFrame().start(stage);
	}
	
	@FXML
	private void onReturn(ActionEvent event) throws Exception {
		new Saler_start().start(stage);
	}
}
