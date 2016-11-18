package presentation.mainui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;
import presentation.userui.user.AllOrder_start;
import presentation.userui.user.DetailedInformation_start;

public class User_controller {
	
	public static Stage stage;
	
	@FXML
	private void onLogout(ActionEvent event) throws IOException {
		new LogFrame().start(stage);
	}
	
	@FXML
	private void onShowOrder(ActionEvent event) throws IOException {
		new AllOrder_start().start(stage);
	}
	
	@FXML
	private void onDetailedInfo(ActionEvent event) throws IOException {
		new DetailedInformation_start().start(stage);
	}

}
