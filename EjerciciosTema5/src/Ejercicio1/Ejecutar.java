package Ejercicio1;

import daw.com.Teclado;

public class Ejecutar {

	public static void main(String[] args) {
		
		int x = Teclado.leerInt("¿Cuántos triángulos vas a meter?");
		
		float[] array = new float[x];
		
		float mayor = 0;
		
		for (int i = 0; i < x; i++) {
			TrianguloIsos triangulo = new TrianguloIsos(0.0, 0.0);
			triangulo.leerDatos();
			array[i] = triangulo.area();
			
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		
		System.out.println(mayor);
	}

}
