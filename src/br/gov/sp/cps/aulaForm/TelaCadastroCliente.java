package br.gov.sp.cps.aulaForm;

import javax.swing.*;

import br.gov.sp.cps.controllers.ClienteController;


public class TelaCadastroCliente extends JFrame {


	private static final long serialVersionUID = 3380577686218387252L;


 JLabel lblNumero1, lblNumero2, lblTitulo, lblResultado;


 JTextField txtNumero1, txtNumero2, txtResultado;
 

 JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar, btnSair;


 public TelaCadastroCliente() {


     setTitle("Calculadora");


     setSize(500, 300);


     setLocationRelativeTo(null);


     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


     setLayout(null);



     lblTitulo = new JLabel("Calculadora");


     lblTitulo.setBounds(200, 10, 200, 30);

     add(lblTitulo);


     lblNumero1 = new JLabel("Número 1:");

     lblNumero1.setBounds(30, 50, 100, 25);

     add(lblNumero1);

  
     txtNumero1 = new JTextField();

  
     txtNumero1.setBounds(130, 50, 250, 25);


     add(txtNumero1);



     lblNumero2 = new JLabel("Número 2:");


     lblNumero2.setBounds(30, 90, 100, 25);

     add(lblNumero2);


     txtNumero2 = new JTextField();

     txtNumero2.setBounds(130, 90, 250, 25);


     add(txtNumero2);


     lblResultado = new JLabel("Resultado: ");


     lblResultado.setBounds(30, 130, 250, 25);

     add(lblResultado);

     txtResultado = new JTextField();

     txtResultado.setBounds(130, 130, 250, 25);


     add(txtResultado);
     txtResultado.setEditable(false);
     
     
     
     btnSomar = new JButton("+");

 
     btnSomar.setBounds(30, 200, 50, 30);


     add(btnSomar);
     
     btnSubtrair = new JButton("-");

     
     btnSubtrair.setBounds(90, 200, 50, 30);


     add(btnSubtrair);
     
     btnMultiplicar = new JButton("x");

     
     btnMultiplicar.setBounds(150, 200, 50, 30);


     add(btnMultiplicar);
     
     btnDividir = new JButton(":");

     
     btnDividir.setBounds(210, 200, 50, 30);


     add(btnDividir);

     btnLimpar = new JButton("Limpar");


     btnLimpar.setBounds(270, 200, 80, 30);


     add(btnLimpar);


     btnSair = new JButton("Sair");


     btnSair.setBounds(380, 200, 70, 30);

     add(btnSair);


 ClienteController controller = new ClienteController(
         txtNumero1,
         txtNumero2,
         txtResultado
     
 );

 btnSomar.addActionListener(controller.acaoSomar());
 btnSubtrair.addActionListener(controller.acaoSubtrair());
 btnMultiplicar.addActionListener(controller.acaoMultiplicar());
 btnDividir.addActionListener(controller.acaoDividir());
 btnLimpar.addActionListener(controller.acaoLimpar());
 btnSair.addActionListener(controller.acaoSair());
}
 

 public static void main(String[] args) {


     TelaCadastroCliente tela = new TelaCadastroCliente();


     tela.setVisible(true);
 }
}