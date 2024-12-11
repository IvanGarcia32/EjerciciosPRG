package Figuras;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
	}
	
	public void cambiarDatos() {
		//Altura
		String tipo = "altura";
		this.altura = doubleVerificado(tipo);
		
		//Base 
		tipo = "base";
		this.base = doubleVerificado(tipo);
		
		//Color
		tipo = "color";
		this.color = intVerificado(tipo);
		
		//Punto
		tipo = "X";
		this.centro.setX(intVerificado(tipo));
		tipo = "Y";
		this.centro.setY(intVerificado(tipo));
	}
	
	public double doubleVerificado(String tipo) {
		double num = 0.0;
		
		do {
			Pantalla.escribirString("Indica el nuevo valor para " + tipo + ": ");
			String alturaNueva = Teclado.leerString();
			
			if (!alturaNueva.isEmpty()) {
				try {
					num = Double.parseDouble(alturaNueva);
				} catch (NumberFormatException e) {
					num = -1;
				}
			}
		} while (num < 0.0);
		
		return num;
	}
	
	public int intVerificado(String tipo) {
		int num = 0;
		
		do {
			Pantalla.escribirString("Indica el nuevo valor para " + tipo + ": ");
			String alturaNueva = Teclado.leerString();
			
			if (!alturaNueva.isEmpty()) {
				try {
					num = Integer.parseInt(alturaNueva);
				} catch (NumberFormatException e) {
					num = -1;
				}
			}
		} while (num < 0);
		
		return num;
	}
	

}
