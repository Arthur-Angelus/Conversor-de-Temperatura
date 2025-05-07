package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Temperatura;

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
		labelResultado.setBounds(130, 150, 350, 20);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("...");
		labelMensagemErro.setFont(new Font("times new Roman", Font.BOLD, 15));
		labelMensagemErro.setForeground(Color.RED);
		labelMensagemErro.setBounds(180, 200, 350, 30);
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(buttonKelvin);
		container.add(buttonFahreinheit);
		container.add(labelResultado);
		container.add(labelMensagemErro);
		
		tela.setVisible(true);
		
buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					labelMensagemErro.setVisible(false);
				
				String Celsius = textCelsius.getText();
				if (!(Celsius.indexOf(",") == -1)) {
					Celsius = Celsius.replace(",", ".");
				}
				if (!(Celsius.indexOf(" ") == -1)) {
					Celsius = Celsius.replace(" ", "");
				}
				
				Temperatura temperatura = new Temperatura();
				temperatura.setCelsius(Double.parseDouble(Celsius));
				temperatura.converterParaKelvin();			
				double Kelvin = temperatura.converterParaKelvin();
				String resultado = Kelvin+" kelvin";
				
				labelResultado.setVisible(true);
				labelResultado.setText(resultado);
				
} catch (NumberFormatException exception) {
					
					//Esconde o resultado anterior, se tiver
					labelResultado.setVisible(false);
					
					//Deixa a mensagem de erro visivel.
					labelMensagemErro.setVisible(true);
					
				}
				
			}
		});
		
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				labelMensagemErro.setVisible(false);
					
				String Celsius = textCelsius.getText();
				if (!(Celsius.indexOf(",") == -1)) {
					Celsius = Celsius.replace(" ", "");
				}
				Temperatura temperatura = new Temperatura();
				temperatura.setCelsius(Double.parseDouble(Celsius));
				temperatura.converterParaFahreinheit();
				double Fahrenheit = temperatura.converterParaFahreinheit();
				String resultado = Fahrenheit+" fahrenheit";
				
				labelResultado.setVisible(true);
				labelResultado.setText(resultado);
				
	} catch (NumberFormatException excepcion) {
		
		labelResultado.setVisible(false);
		labelMensagemErro.setVisible(true);
	}
				
			}
		});
		
		tela.setVisible(true);
		
	}

}
