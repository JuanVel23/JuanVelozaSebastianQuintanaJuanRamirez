package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelTeclado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bot1,bot2,bot3, bot4;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	
	
	public PanelTeclado () {
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Juega");
		border.setTitleColor(Color.black);
		setBorder(border);
		Font text = new Font("Arial",3,40 );
		bot1 = new JButton();
		
		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(2,2));
		bot1.setText("1");
		bot1.setFont(text);
		bot1.setActionCommand(UNO);
		bot2 = new JButton();
		bot2.setText("2");
		bot2.setFont(text);
		bot2.setActionCommand(DOS);
		bot3 = new JButton();
		bot3.setText("3");
		bot3.setFont(text);
		bot3.setActionCommand(TRES);
		bot4 = new JButton();
		bot4.setText("4");
		bot4.setFont(text);
		bot4.setActionCommand(CUATRO);
		
		aux.add(bot1);
		aux.add(bot2);
		aux.add(bot3);
		aux.add(bot4);
		
		add(aux, BorderLayout.CENTER);
	}

	public JButton getBot1() {
		return bot1;
	}

	public void setBot1(JButton bot1) {
		this.bot1 = bot1;
	}

	public JButton getBot2() {
		return bot2;
	}

	public void setBot2(JButton bot2) {
		this.bot2 = bot2;
	}

	public JButton getBot3() {
		return bot3;
	}

	public void setBot3(JButton bot3) {
		this.bot3 = bot3;
	}

	public JButton getBot4() {
		return bot4;
	}

	public void setBot4(JButton bot4) {
		this.bot4 = bot4;
	}
	
	
}
