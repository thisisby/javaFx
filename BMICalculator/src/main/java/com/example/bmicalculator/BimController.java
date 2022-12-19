package com.example.bmicalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BimController {
	private double weight;
	private double height;

	@FXML
	private TextField weightLabel;

	@FXML
	private TextField heightLabel;

	@FXML
	private TextField result;

	@FXML
	private Button engU;

	@FXML
	private Button metU;

	@FXML
	void engClick(ActionEvent event) {
		try	{
			this.weight = Double.parseDouble(weightLabel.getText());
			this.height = Double.parseDouble(heightLabel.getText());

			double value = 703 * (weight/Math.pow(height,2));
			String res = "";
			if(value<0){
				throw new NumberFormatException();
			}
			if(value<18.5) {
				res = "Underweighted";
			} else if (value >=18.8 && value <= 24.9) {
				res = "Normal";
			}  else if(value>=25 && value<= 29.99){
				res = "Overweight";
			}
			else{
				res = "Obese";
			}

			result.setText(res);

		} catch (NumberFormatException ex) {
			weightLabel.setText("Enter Weight");
			heightLabel.setText("Enter Height");
		}
	}


	@FXML
	void metClick(ActionEvent event) {
		try	{
			engClick(event);
		} catch (NumberFormatException ex) {
			weightLabel.setText("Enter Weight");
			heightLabel.setText("Enter Height");
		}
	}


}