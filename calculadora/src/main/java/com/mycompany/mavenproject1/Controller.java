package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

	@FXML
	private AnchorPane anchorPane;
	@FXML
	private TextField pantalla;
	@FXML
	private Button buttonC;
	@FXML
	private Button buttonDiv;
	@FXML
	private Button buttonPlusRest;
	@FXML
	private Button buttonPercent;
	@FXML
	private Button buttonMulti;
	@FXML
	private Button buttonRest;
	@FXML
	private Button buttonPlus;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button0;
	@FXML
	private Button buttonPunto;
	@FXML
	private Button buttonIgual;

    @FXML
    private void driver(javafx.event.ActionEvent event) throws IOException {
     
	 pantalla.setEditable(false);

	 if(!pantalla.getText().isEmpty()){
		String num =((Button) event.getSource()).getText();
		pantalla.setText(num);
	  }else{
		String nextNum =((Button) event.getSource()).getText();
		pantalla.setText(pantalla.getText()+nextNum);
	  }
    }
}
