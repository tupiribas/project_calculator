package model.service;

import javafx.scene.control.TextField;

public class CalculationService {

	public static String checkingOperations(TextField txt) {
		String result = null;
		
		if (txt.getText().contains("+")) {
			result = calculationSum(txt);
		} 
		else if (txt.getText().contains("-")) {
			result = calculationSubtration(txt);
		}
		else if (txt.getText().contains("x")) {
			result = calculationMultiplication(txt);
		}
		else if (txt.getText().contains("÷")) {
			result = calculationDivision(txt);
		}
		
		return result;
	}

	private static String calculationDivision(TextField txt) {
		String[] num = txt.getText().split("÷");

		int v1 = Integer.parseInt(num[1]);
		int v0 = Integer.parseInt(num[0]);

		double div = (double) v0 / v1;

		return String.valueOf(div);
	}
	
	private static String calculationMultiplication(TextField txt) {
		String[] num = txt.getText().split("x");

		int v1 = Integer.parseInt(num[1]);
		int v0 = Integer.parseInt(num[0]);

		int mult = v1 * v0;

		return String.valueOf(mult);
	}
	
	private static String calculationSubtration(TextField txt) {
		String[] num = txt.getText().split("-");

		int v1 = Integer.parseInt(num[1]);
		int v0 = Integer.parseInt(num[0]);

		int sub = v1 - v0;

		return String.valueOf(sub);
	}

	private static String calculationSum(TextField txt) {
		String[] num = txt.getText().split("\\+");

		int v1 = Integer.parseInt(num[1]);
		int v0 = Integer.parseInt(num[0]);

		int sum = v1 + v0;

		return String.valueOf(sum);
	}

}
