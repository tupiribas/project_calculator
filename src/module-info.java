module project_calculator {
	requires javafx.controls;
	
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.graphics, javafx.fxml;
}
