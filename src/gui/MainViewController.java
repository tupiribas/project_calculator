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
	private Button btValueSub;
	
	@FXML
	private Button btValueSum;

	@FXML
	private Button btValueMul;

	@FXML
	private Button btValueDiv;

	@FXML
	private Button btValueResult;

	@FXML
	private Button btValueFloatingPoint;
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
