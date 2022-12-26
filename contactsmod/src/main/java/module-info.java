module com.example.contactsmod {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.contactsmod to javafx.fxml;
	exports com.example.contactsmod;
}