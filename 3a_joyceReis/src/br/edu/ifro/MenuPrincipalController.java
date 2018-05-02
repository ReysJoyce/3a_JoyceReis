/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Amanda Reis
 */
public class MenuPrincipalController implements Initializable {
    
   
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultado;
            
    @FXML
    private Label label;
    
   
    
    @FXML
    private void somar(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double resultado = num1 + num2;
      
      txtResultado.setText(resultado.toString());
    }
    
     @FXML
    private void Dividir(ActionEvent event){
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double resultado = num1 / num2;
      
      txtResultado.setText(resultado.toString());
     
    }
    @FXML
    private void Multiplicar(ActionEvent event){
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double resultado = num1 * num2;
      
      txtResultado.setText(resultado.toString());
     
    }
    
    @FXML
    private void Subtrair(ActionEvent event){
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double resultado = num1 - num2;
      
      txtResultado.setText(resultado.toString());
     
    }
    
    @FXML
    private void Limpar(ActionEvent event){
      txtNumero1.setText("");
      txtNumero2.setText("");
      txtResultado.setText("");
     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
