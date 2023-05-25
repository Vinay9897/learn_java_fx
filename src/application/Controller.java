package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;



public class Controller {
	
	@FXML
	
	private Circle myCircle;
	private double x;
	private double y;
	
	public void left(ActionEvent e)
	{
		myCircle.setCenterX(x-=2);
	}
	
	public void down(ActionEvent e)
	{
	
		myCircle.setCenterY(y+=2);
	}
	
	public void up(ActionEvent e)
	{
	myCircle.setCenterY(y-=2);
	}
	public void right(ActionEvent e)
	{
		myCircle.setCenterX(x+=2);
	}
}
