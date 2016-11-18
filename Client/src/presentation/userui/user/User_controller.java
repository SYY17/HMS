/*
 *@(#)Test.java 2016��10��23��
 *
 *Copyright 2016 ysy,All rights reserved.
 */
package presentation.userui.user;

import java.io.IOException;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import presentation.loginui.LogFrame;
//have not finished4
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
	private void onDetailedInfo(ActionEvent event) {
		new DetailedInfomation_start().start(stage);
	}
	
	@FXML
	private void onAllOrderHistory(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}
	
	@FXML
	private void onHelp(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}
	
	@FXML
	private void onHotelList(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}

}
