package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

	@FXML
	
	Label nameLabel;
	
	public void displayName(String name) {
		nameLabel.setText("Hello, I am " + name);
	}
}
