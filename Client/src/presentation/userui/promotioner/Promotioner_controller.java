/*
 *@(#)Test.java 2016年10月23日
 *
 *Copyright 2016 Zyz,All rights reserved.
 */
package presentation.userui.promotioner;

/**
 *
 *@author 宇州
 */
import java.io.File;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class Promotioner_controller {
    @FXML
    private AnchorPane layoutPane;
	
	@FXML
	private void onLogOut(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "您已退出", "关于", JOptionPane.PLAIN_MESSAGE);
	}

}
