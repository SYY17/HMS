/*
 *@(#)Test.java 2016��10��23��
 *
 *Copyright 2016 Zyz,All rights reserved.
 */
package presentation.userui.saler;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Saler_controller {
	
	@FXML
	private void onLogout(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}

}
