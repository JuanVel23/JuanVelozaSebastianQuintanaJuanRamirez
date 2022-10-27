package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private Simon sm;
	
	public Controller () {
		gui = new View(this);
		sm = new Simon();
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
