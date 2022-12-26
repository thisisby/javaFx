package com.example.tipcalculatormod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculatorModification extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("tipCalculatorModification.fxml"));
		primaryStage.setTitle("Modified Tip Calculator");
		primaryStage.setScene(new Scene(root, 300, 275));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}


}