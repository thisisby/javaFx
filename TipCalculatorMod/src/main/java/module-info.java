module com.example.tipcalculatormod {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.tipcalculatormod to javafx.fxml;
	exports com.example.tipcalculatormod;
}