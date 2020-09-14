package controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ThreadJogo extends Thread {
	private JButton btnJogar;
	private JTextField num;
	private static int cont = 0;
	private static String[] vetor = new String[3];
	
	
	public ThreadJogo(JTextField num, JButton btnJogar) {
		this.num = num;
		this.btnJogar = btnJogar;
		
	}
	
	public void run() {
		tiraNumeros();
		
		
	}
	
	public void tiraNumeros() {
		btnJogar.setEnabled(false);
		int j = (int) (Math.random() * (151 - 1)+1);
		for (int i = 0; i<j; i++) {
			String valor = Integer.toString((int) (Math.random() * (7 - 1)+1));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num.setText(valor);
		}
		cont++;
		vetor[cont-1] = num.getText();
		if(cont == 3) {
			btnJogar.setEnabled(true);
		if (vetor[1] == vetor[2] && vetor[2] == vetor[3]) {
			JOptionPane.showMessageDialog(null, "INÁCREDITÁVEL, VOCÊ GANHOU!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você perdeu, tente novamente!");
		}
		cont = 0;
		}
	}

}
