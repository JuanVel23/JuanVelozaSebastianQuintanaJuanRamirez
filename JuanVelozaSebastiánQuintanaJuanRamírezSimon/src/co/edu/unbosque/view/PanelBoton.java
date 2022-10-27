package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelBoton extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botter;
	public static final String TERMINAR = "Terminar";
	
	public PanelBoton(){
		setLayout(new GridLayout(1,3));
		botter = new JButton("Terminar");
		botter.setActionCommand(TERMINAR);
		
		add(new JLabel());
		add(botter);
		add(new JLabel());
	}

	public JButton getBotter() {
		return botter;
	}

	public void setBotter(JButton botter) {
		this.botter = botter;
	}
	
}
