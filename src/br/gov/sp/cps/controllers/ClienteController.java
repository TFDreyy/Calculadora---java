package br.gov.sp.cps.controllers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteController {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;

    public ClienteController(
            JTextField txtNumero1,
            JTextField txtNumero2,
            JTextField txtResultado
            ) {

        this.txtNumero1 = txtNumero1;
        this.txtNumero2 = txtNumero2;
        this.txtResultado = txtResultado;
        

    }

    public ActionListener acaoSomar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(txtNumero1.getText());
                float num2 = Float.parseFloat(txtNumero2.getText());
                float soma = num1 + num2;
                txtResultado.setText(String.valueOf(soma));
                
               
                
            }
        };
    }
    
    public ActionListener acaoSubtrair() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(txtNumero1.getText());
                float num2 = Float.parseFloat(txtNumero2.getText());
                float subtracao = num1 - num2;
                txtResultado.setText(String.valueOf(subtracao));
                
               
                
            }
        };
    }

    public ActionListener acaoMultiplicar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(txtNumero1.getText());
                float num2 = Float.parseFloat(txtNumero2.getText());
                float multiplicar = num1 * num2;
                txtResultado.setText(String.valueOf(multiplicar));
                
               
                
            }
        };
    }
    
    
    public ActionListener acaoDividir() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(txtNumero1.getText());
                float num2 = Float.parseFloat(txtNumero2.getText());
                float dividir = num1 / num2;
                txtResultado.setText(String.valueOf(dividir));
                
               
                
            }
        };
    }
    
    
    
    public ActionListener acaoLimpar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero1.setText("");
                txtNumero2.setText("");
                txtResultado.setText("");


                JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
            }
        };
    }

    public ActionListener acaoSair() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}