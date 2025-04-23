package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	private String conversorDeTemperatura;
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	public void criarTelaConversor(String conversorDeTemperatura) {
		
		this.conversorDeTemperatura = conversorDeTemperatura;
		JFrame tela = new JFrame();
		tela.setTitle(conversorDeTemperatura);
		tela.setSize(400, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		Container container = tela.getContentPane();
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(20, 20, 250, 30);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 50, 350, 30);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(20, 90, 170, 30);
		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(200, 90, 170, 30);
		
		labelResultado = new JLabel();
		labelResultado.setText("resultado");
		labelResultado.setFont(new Font("times new Roman", Font.BOLD, 25));
		labelResultado.setBounds(130, 150, 150, 20);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("erro");
		labelMensagemErro.setFont(new Font("times new Roman", Font.BOLD, 15));
		labelMensagemErro.setForeground(Color.RED);
		labelMensagemErro.setBounds(180, 200, 50, 30);
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(buttonKelvin);
		container.add(buttonFahreinheit);
		container.add(labelResultado);
		container.add(labelMensagemErro);
		
		tela.setVisible(true);
		
	}

}
