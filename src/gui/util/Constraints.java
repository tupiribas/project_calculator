package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obj, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}
	
	public static void setTextFieldOperations(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*[\\-+x�]\\d+")) {
				txt.setText(oldValue);
			}
		});
	}
}
