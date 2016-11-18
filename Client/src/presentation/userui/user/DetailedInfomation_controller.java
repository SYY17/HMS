package presentation.userui.user;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;

public class DetailedInfomation_controller {
	
	public static Stage stage;

	@FXML
	private void onLogout(ActionEvent event) throws IOException {
		new LogFrame().start(stage);
	}

	@FXML
	private void onBack(ActionEvent event) throws IOException  {
		new User_start().start(stage);
	}
	
	
	@FXML
	private void onShowOrder(ActionEvent event) throws IOException {
		new AllOrder_start().start(stage);
	}
	
	@FXML
	private void onDetailedInfo(ActionEvent event) {
		new DetailedInfomation_start().start(stage);
	}
	
	@FXML
	private void onEdit(ActionEvent event) {
		new User_start().start(stage);
		//JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}
	
	@FXML
	private void onSubmit(ActionEvent event) {
		new User_start().start(stage);
		//JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}
}
