package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private PanelNúmero pn;
	private PanelTeclado pt;
	private PanelBoton pb;
	private static final long serialVersionUID = 1L;

	
	public View (Controller control) {
		
		setSize(700, 600);
		setResizable(false);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		pn = new PanelNúmero();
		add(pn, BorderLayout.NORTH);
		
		pt = new PanelTeclado();
		add(pt, BorderLayout.CENTER);
		
		pb = new PanelBoton();
		add(pb, BorderLayout.SOUTH);
		
		
		pt.getBot1().addActionListener(control);
		pt.getBot2().addActionListener(control);
		pt.getBot3().addActionListener(control);
		pt.getBot4().addActionListener(control);
		pb.getBotter().addActionListener(control);
	}
}
