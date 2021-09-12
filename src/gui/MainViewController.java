package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainViewController implements Initializable {
	
	// Cálculo e Resposta
	@FXML
	private Label labelCalculation;

	@FXML
	private Label labelResp;
	

	// Botões de Valores
	@FXML
	private Button btValue00;

	@FXML
	private Button btValue01;

	@FXML
	private Button btValue02;

	@FXML
	private Button btValue03;

	@FXML
	private Button btValue04;

	@FXML
	private Button btValue05;

	@FXML
	private Button btValue06;

	@FXML
	private Button btValue07;

	@FXML
	private Button btValue08;

	@FXML
	private Button btValue09;

	// Botões de Operações
	@FXML
	private Button btOperationSub;

	@FXML
	private Button btOperationSum;

	@FXML
	private Button btOperationMul;

	@FXML
	private Button btOperationDiv;

	@FXML
	private Button btValueResult;

	@FXML
	private Button btValueFloatingPoint;
	
	@FXML
	public void onAddNumbersToLabel() {
		if (btValue00.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "0");
		}
		if (btValue01.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "1");
		}
		if (btValue02.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "2");
		}
		if (btValue03.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "3");
		}
		if (btValue04.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "4");
		}
		if (btValue05.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "5");
		}
		if (btValue06.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "6");
		}
		if (btValue07.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "7");
		}
		if (btValue08.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "8");
		}
		if (btValue09.isArmed()) {
			labelCalculation.setText(labelCalculation.getText() + "9");
		}
	}
	
	public void onAddOperations() {
		int cont = 0;

		if (cont <= 0) {
			if (btOperationSub.isArmed()) {
				labelCalculation.setText(labelCalculation.getText() + " - ");
			}
		}
		else if (cont <= 0) {
			if (btOperationSum.isArmed()) {
				labelCalculation.setText(labelCalculation.getText() + " + ");
			}
		}
		else if (cont <= 0) {
			if (btOperationMul.isArmed()) {
				labelCalculation.setText(labelCalculation.getText() + " x ");
			}
		}
		else if (cont <= 0)  {
			if (btOperationDiv.isArmed()) {
				labelCalculation.setText(labelCalculation.getText() + " ÷ ");
			}
		}
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
