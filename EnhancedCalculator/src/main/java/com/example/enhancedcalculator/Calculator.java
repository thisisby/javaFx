package com.example.enhancedcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));

		Scene scene = new Scene(root);
		primaryStage.setTitle("Advanced Tip Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}


}