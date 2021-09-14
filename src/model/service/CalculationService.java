package model.service;

import java.util.Locale;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculationService {

	public static void checkingOperations(TextField txt, Label label) {
		
		if (txt.getText().contains("+")) {
			label.setText(txt.getText() + " = " + calculationSum(txt));
		} 
		else if (txt.getText().contains("-")) {
			label.setText(txt.getText() + " = " + calculationSubtration(txt));
		}
		else if (txt.getText().contains("x")) {
			label.setText(txt.getText() + " = " + calculationMultiplication(txt));
		}
		else if (txt.getText().contains("÷")) {
			label.setText(txt.getText() + " = " + calculationDivision(txt));
		}
	}

	private static String calculationDivision(TextField txt) {
		String[] num = txt.getText().split("÷");

		double v1 = Double.parseDouble(num[1]);
		double v0 = Double.parseDouble(num[0]);

		double div = v0 / v1;

		return String.valueOf(div);
	}
	
	private static String calculationMultiplication(TextField txt) {
		String[] num = txt.getText().split("x");

		double v1 = Double.parseDouble(num[1]);
		double v0 = Double.parseDouble(num[0]);

		double mult = v1 * v0;

		return String.valueOf(mult);
	}
	
	private static String calculationSubtration(TextField txt) {
		String[] num = txt.getText().split("-");

		double v1 = Double.parseDouble(num[1]);
		double v0 = Double.parseDouble(num[0]);

		double sub = v1 - v0;

		return String.valueOf(sub);
	}

	private static String calculationSum(TextField txt) {
		Locale.setDefault(Locale.US);
		String[] num = txt.getText().split("\\+");

		double v1 = Double.parseDouble(num[1]);
		double v0 = Double.parseDouble(num[0]);

		double sum = v1 + v0;

		return String.valueOf(sum);
	}

}
