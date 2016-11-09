/*
 *@(#)Test.java 2016年10月23日
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
		JOptionPane.showMessageDialog(null, "您已退出", "关于", JOptionPane.PLAIN_MESSAGE);
	}

}
