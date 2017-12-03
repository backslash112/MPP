package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX Welcome");
//			BorderPane root = new BorderPane();
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(25, 25, 25, 25));
			grid.setHgap(10);
			grid.setVgap(10);
			
			Text title = new Text("Welcome");
			title.setId("welcome-text");
			grid.add(title, 0, 0);
			
			Label name = new Label("User Name");
			grid.add(name, 0, 1);
			Label pwd = new Label("Password");
			grid.add(pwd, 0, 2);
			
			TextField nameTextField = new TextField();
			PasswordField pwdTextField = new PasswordField();
			grid.add(nameTextField, 1, 1);
			grid.add(pwdTextField, 1, 2);
			
			Button signInBtn = new Button("Sign In");
			signInBtn.setOnAction(new EventHandler<ActionEvent> () {
				@Override public void handle(ActionEvent e) {
					
				}
			});
//			grid.add(signInBtn, 1, 3);
			HBox box = new HBox(10);
			box.setAlignment(Pos.BOTTOM_RIGHT);
			box.getChildren().add(signInBtn);
			grid.add(box, 1, 3);
			
			Scene scene = new Scene(grid,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
