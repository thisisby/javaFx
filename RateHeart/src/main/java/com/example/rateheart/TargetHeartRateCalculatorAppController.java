package com.example.rateheart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.MathContext;

public class TargetHeartRateCalculatorAppController {

	@FXML
	private TextField age;
	@FXML
	private TextField rate;

	@FXML
	private Button button;


	@FXML
	void calculate(ActionEvent event) {
		try{
			BigDecimal userAge = new BigDecimal(age.getText());
			if(userAge.compareTo(new BigDecimal(0))<=0){
				throw  new NumberFormatException();
			}
			BigDecimal maximumHeartRate = new BigDecimal(200).subtract(userAge);
			BigDecimal heartRateLower = maximumHeartRate.multiply(new BigDecimal(0.50)).round(new MathContext(4));
			BigDecimal heartRateUpper = maximumHeartRate.multiply(new BigDecimal(0.85)).round(new MathContext(4));


			String ans = String.format("%s bpm - %s bpm",heartRateLower.toString(),heartRateUpper.toString());
			rate.setText(ans);

		}
		catch (NumberFormatException ex){
			rate.setText("Enter your Age");
		}

	}

}