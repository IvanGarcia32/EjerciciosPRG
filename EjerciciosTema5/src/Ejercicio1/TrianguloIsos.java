package Ejercicio1;
import daw.com.Pantalla;
import daw.com.Teclado;

public class TrianguloIsos {
	private double base;
	private double altura;
	
	public TrianguloIsos(double base, double altura) {
		this.base = base;
		this.altura = altura;
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
	
	//Usos
	
	public float area() {
		return (float) (base * altura) / 2;
	}
	
	public float perimetro () {
		return (float) (Math.sqrt((altura*altura) + ((base/2)*(base/2))) * 2 + base); 
	}
	
	public void leerDatos() {
		String tipo = "base";
		setBase (doubleVerificado(tipo));
		
		tipo = "altura";
		setAltura (doubleVerificado(tipo));
		
	}
	
	public double doubleVerificado(String tipo) {
		double num = 0.0;
		
		do {
			Pantalla.escribirString("Indica el valor para " + tipo + ": ");
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
}
