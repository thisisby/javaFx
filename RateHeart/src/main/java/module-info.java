module com.example.rateheart {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.rateheart to javafx.fxml;
	exports com.example.rateheart;
}