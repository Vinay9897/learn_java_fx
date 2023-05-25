package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {

	@FXML
	private Label mylabel;
	@FXML
	private RadioButton rbutton1,rbutton2, rbutton3;
	
	public void getFood(ActionEvent event) {
		
		if(rbutton1.isSelected())
		{
			mylabel.setText("pizza");
		}
		else if(rbutton2.isSelected())
		{
			mylabel.setText("Shushi");
		}
		else {
			mylabel.setText("Ramen");
		}
	}
	
}
