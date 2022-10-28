package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelNúmero extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lab;
	private JTextField txtnum;
	private JButton botgen;
	public static final String GENERAR = "Generar";
	
	public PanelNúmero() {
		
		setLayout (new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Numero");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		lab = new JLabel("Numero Generado: ");
		txtnum = new JTextField("");
		txtnum.setForeground(Color.black);
		txtnum.setBackground(Color.white);
		botgen = new JButton("Generar");
		botgen.setActionCommand(GENERAR);
		
		add(lab);
		add(txtnum);
		add(new JLabel());
		add(botgen);
		
	}

	public JLabel getLab() {
		return lab;
	}

	public void setLab(JLabel lab) {
		this.lab = lab;
	}

	public JTextField getTxtnum() {
		return txtnum;
	}

	public void setTxtnum(JTextField txtnum) {
		this.txtnum = txtnum;
	}

	public JButton getBotgen() {
		return botgen;
	}

	public void setBotgen(JButton botgen) {
		this.botgen = botgen;
	}
	
	
}
