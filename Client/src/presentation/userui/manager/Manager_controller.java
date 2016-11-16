package presentation.userui.manager;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Manager_controller {
    @FXML
    private Pane layoutPane;
	
	@FXML
	private void onLogOut(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}

}
