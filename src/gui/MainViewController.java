package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.service.CalculationService;

public class MainViewController implements Initializable {

	// Cálculo e Resposta
	@FXML
	private TextField txtCalculation;

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
	private Button btResult;

	@FXML
	private Button btFloatingPoint;

	@FXML
	public void onAddNumbersToLabel() {
		if (btValue00.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "0");
		}
		if (btValue01.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "1");
		}
		if (btValue02.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "2");
		}
		if (btValue03.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "3");
		}
		if (btValue04.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "4");
		}
		if (btValue05.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "5");
		}
		if (btValue06.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "6");
		}
		if (btValue07.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "7");
		}
		if (btValue08.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "8");
		}
		if (btValue09.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "9");
		}
	}

	@FXML
	public void onAddOperations() {
		if (btOperationSub.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "-");
		} 
		else if (btOperationSum.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "+");
		} 
		else if (btOperationMul.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "x");
		} 
		else if (btOperationDiv.isArmed()) {
			txtCalculation.setText(txtCalculation.getText() + "÷");
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldMaxLength(txtCalculation, 30);
		Constraints.setTextFieldOperations(txtCalculation);
	}
	
	@FXML
	public void equal() {
		if (btResult.isArmed()) {
			String resp = CalculationService.checkingOperations(txtCalculation);
			labelResp.setText(resp);
		}
	}
}
