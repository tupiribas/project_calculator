package model.service;

import javafx.scene.control.TextField;

public class CalculationService {
	
	public static void checkingOperations(TextField txt) {
		
	}
	
	private static String calculationSubtration(TextField txt) {
		String[] num = txt.getText().split(" - ");
		
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
