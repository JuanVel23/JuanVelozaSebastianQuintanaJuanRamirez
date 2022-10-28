package co.edu.unbosque.model;

import java.util.Random;

public class NumeroGenerado {

	private int x1, x2, x3, x4;
	
	public NumeroGenerado() {
		this.x1 = 0;
		this.x2 = 0;
		this.x3 = 0;
		this.x4 = 0;
	}
	
	public int generarDigito1() {
		int numero =(int) Math.floor(Math.random()*(4-1+1)+1);
		x1 = numero;
		return x1;
	}
	
	public int generarDigito2() {
		int numero = (int)  Math.floor(Math.random()*(4-1+1) +1);
		x2 = numero;
		return x2;
	}
	
	public int generarDigito3() {
		int numero = (int)  Math.floor(Math.random()*(4-1+1) +1);
		x3 = numero;
		return x3;
	}
	
	public int generarDigito4() {
		int numero = (int)  Math.floor(Math.random()*(4-1+1) +1);
		x4 = numero;
		return x4;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}
	
	
}
