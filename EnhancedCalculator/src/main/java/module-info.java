module com.example.enhancedcalculator {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.enhancedcalculator to javafx.fxml;
	exports com.example.enhancedcalculator;
}