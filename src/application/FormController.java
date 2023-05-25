package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FormController {
	
	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	
	public void submit(ActionEvent event)
	{
		try {
			int age = Integer.parseInt(myTextField.getText());
			if(age < 18)
			{
				myLabel.setText("Sorry , You are not valid for Registration");
			}
			else if(age>19) {
				myLabel.setText("Registration Successfull");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter the Number please");
			myLabel.setText("Please the Numbers Only");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
