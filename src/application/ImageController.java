package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
	
	@FXML
	ImageView imageView ;
	Button myButton;
	
	 Image myImage1 = new Image(getClass().getResourceAsStream("helicopter.jpg"));
	public void displayImage() {
		imageView.setImage(myImage1);
	}

}
