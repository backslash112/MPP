package application;
	
//import java.awt.Insets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		primaryStage.setTitle("Address Form");
		
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Label name = new Label("Name");
		grid.add(name, 0, 0);
		TextField nameTextField = new TextField();
		grid.add(nameTextField, 0, 1);
		
		Label street = new Label("Street");
		grid.add(street, 1, 0);
		TextField streetTextField = new TextField();
		grid.add(streetTextField, 1, 1);
		
		Label city = new Label("City");
		grid.add(city, 2, 0);
		TextField cityTextField = new TextField();
		grid.add(cityTextField, 2, 1);
		
		Label state = new Label("State");
		grid.add(state, 0, 2);
		TextField stateTextField = new TextField();
		grid.add(stateTextField, 0, 3);
		
		Label zip = new Label("Zip");
		grid.add(zip, 2, 2);
		TextField zipTextField = new TextField();
		grid.add(zipTextField, 2, 3);
		
		Button submitBtn = new Button("Submit");
		grid.add(submitBtn, 1, 10);
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				String name = nameTextField.getText();
				String street = streetTextField.getText();
				String city = cityTextField.getText();
				String state = stateTextField.getText();
				String zip = zipTextField.getText();
				System.out.println(name + "\n" + street);
				System.out.println(city + ", " + state + " " + zip);
			}
		});
		
		Scene scene = new Scene(grid, 600, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
