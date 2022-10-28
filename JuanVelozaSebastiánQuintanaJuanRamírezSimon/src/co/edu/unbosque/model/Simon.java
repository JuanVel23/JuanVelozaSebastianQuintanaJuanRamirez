package co.edu.unbosque.model;

public class Simon {
	
	private NumeroGenerado numgen;
	
	public Simon() {
		numgen = new NumeroGenerado();
	}
	
	public String generarNumero() {
		return numgen.generarDigito1() + " " +numgen.generarDigito2() + " " + numgen.generarDigito3() + " " + numgen.generarDigito4();
	}
}
