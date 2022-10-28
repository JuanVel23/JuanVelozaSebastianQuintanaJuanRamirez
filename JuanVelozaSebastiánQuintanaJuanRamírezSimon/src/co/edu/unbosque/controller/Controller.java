package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

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
	public void actionPerformed(ActionEvent evento) {
		
		
		if(evento.getActionCommand().equals(gui.getPn().GENERAR)) {
			gui.borrarNumeros();
			gui.getPn().getTxtnum1().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum2().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum3().setText(sm.getNumgen().generarDigito());
			gui.getPn().getTxtnum4().setText(sm.getNumgen().generarDigito());
			gui.getPn().getBotgen().setVisible(false);
		}
	}
	
}	
