package presentation.mainui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;

public class Manager_controller {
	
	public static Stage stage;
	
    @FXML
    private Pane layoutPane;
	
	@FXML
	private void onLogout(ActionEvent event) throws IOException {
		new LogFrame().start(stage);
	}

}
