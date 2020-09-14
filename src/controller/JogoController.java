package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class JogoController implements ActionListener {
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JButton btnJogar;
	
		public JogoController(JTextField num1, JTextField num2, JTextField num3, JButton btnJogar) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
			this.btnJogar = btnJogar;
		}
		
		public void actionPerformed(ActionEvent e) {
			botaoJogar();
		}
		
		private void botaoJogar() {
			Thread jogo1 = new ThreadJogo(num1, btnJogar);
			Thread jogo2 = new ThreadJogo(num2, btnJogar);
			Thread jogo3 = new ThreadJogo(num3, btnJogar);
			jogo1.start();
			jogo2.start();
			jogo3.start();
			
		}
		
		
}
