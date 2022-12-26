module com.example.miniwebbrowser {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;


	opens com.example.miniwebbrowser to javafx.fxml;
	exports com.example.miniwebbrowser;
}