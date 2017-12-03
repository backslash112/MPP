package application;
	
import java.util.LinkedHashSet;
import java.util.Set;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


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
		
		primaryStage.setTitle("String Utility");
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		TextField inputTextField = new TextField();
		TextField outputTextField = new TextField();
		Button countLettersBtn = new Button("Count Letters");
		countLettersBtn.setOnAction(new EventHandler<ActionEvent> () {
			@Override public void handle(ActionEvent e) {
				String inputValue = inputTextField.getText();
				int length = inputValue.length();
				outputTextField.setText(Integer.toString(length));
			}
		});
		grid.add(countLettersBtn, 0, 0);
		
		Button reverseLettersBtn = new Button("Reverse Letters");
		reverseLettersBtn.setOnAction(new EventHandler<ActionEvent> () {
			@Override public void handle(ActionEvent e) {
				String inputValue = inputTextField.getText();
				String reverseValue = new StringBuilder(inputValue).reverse().toString();
				outputTextField.setText(reverseValue);
			}
		});
		grid.add(reverseLettersBtn, 0, 1);
		
		Button removeLettersBtn = new Button("Remove Letters");
		removeLettersBtn.setOnAction(new EventHandler<ActionEvent> () {
			@Override public void handle(ActionEvent e) {
				String inputValue = inputTextField.getText();
				String result = removeDuplicateChar(inputValue);
				outputTextField.setText(result);
			}
		});
		grid.add(removeLettersBtn, 0, 2);
		
		Label input = new Label("Input");
		grid.add(input, 1, 0);
		Label output = new Label("Output");
		grid.add(output, 1, 1);
		
//		inputTextField = new TextField();
		grid.add(inputTextField, 2, 0);
//		outputTextField = new TextField();
		grid.add(outputTextField, 2, 1);
		
		Scene scene = new Scene(grid, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static String removeDuplicateChar(String inputValue) {
		char[] chars = inputValue.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character c: chars) {
			charSet.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Character c: charSet) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
