package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
//import javafx.scene.input.KeyCombination;
//import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.text.*;


public class Main extends Application {
	@Override	
	public void start(Stage primaryStage) {
		try {
//			Group root = new Group();
//			Scene scene = new Scene(root,600,600,Color.GREEN);
//			Image image = new Image("C:\\Users\\Vinay\\eclipse-workspace\\learn_javafx\\src\\application\\img4.png");
//			primaryStage.getIcons().add(image);
//			primaryStage.setTitle("Learn JavaFX");
//			primaryStage.setScene(scene);
//			primaryStage.setResizable(false);
//			primaryStage.setX(50);
//			primaryStage.setY(50);
			
//			Text text = new Text();
//			text.setText("Hi, I am Vinay");
//			text.setX(50);
//			text.setY(50);
//			text.setFont(Font.font("Arial",50));
//			text.setFill(Color.ALICEBLUE);
			
//			Line line = new Line();
//			line.setStartX(200);
//			line.setStartY(200);
//			line.setEndX(500);
//			line.setEndY(200);
//			line.setStrokeWidth(4);
//			line.setOpacity(0.5);
//			line.setRotate(45);
//			line.setStroke(Color.RED);
			
			//Rectangle
//			Rectangle rect = new Rectangle();
//			rect.setX(100);
//			rect.setY(100);
//			rect.setWidth(100);
//			rect.setHeight(100);
//			
//			root.getChildren().add(text);
//			root.getChildren().add(line);
//			root.getChildren().add(rect);
			
			
			
			
//			primaryStage.setWidth(400);
//			primaryStage.setHeight(400);
//			primaryStage.setFullScreen(true);
//			primaryStage.setFullScreenExitHint("you can escape until you type V");
//			primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("V"));
			
			
//			=====================================================
			
			Parent root = FXMLLoader.load(getClass().getResource("/RadioScene.fxml"));
			Scene scene  = new Scene(root,600, 400);
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			primaryStage.setTitle("Web Design");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
