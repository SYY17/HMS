/*
 *@(#)Test.java 2016��10��23��
 *
 *Copyright 2016 Zyz,All rights reserved.
 */
package presentation.userui.manager;

/**
 *
 *@author ����
 */
import java.io.File;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Manager_controller {
    @FXML
    private Pane layoutPane;
	
	@FXML
	private void onLogOut(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "�����˳�", "����", JOptionPane.PLAIN_MESSAGE);
	}

}
