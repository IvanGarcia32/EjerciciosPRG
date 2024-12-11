package Figuras;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

    private int ancho;
    private int alto;
    private Punto centro;
    private int color;
    
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
        this.centro = new Punto();
        this.color = 0;
    }

    public Rectangulo(int ancho, int alto, Punto centro, int color) {
        this.ancho = ancho;
        this.alto = alto;
        this.centro = centro;
        this.color = color;
    }

    public Rectangulo(Rectangulo rect) {
        this.ancho = rect.ancho;
        this.alto = rect.alto;
        this.centro = new Punto(rect.centro);
        this.color = rect.color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void mostrarDatos() {
        Pantalla.escribirString("Datos del Rectángulo:");
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Centro:");
        centro.mostrarDatos();
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Ancho: " + String.valueOf(ancho));
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Alto: " + alto);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Color: " + color);
    }

    public void cambiarDatos() {
        Pantalla.escribirString("Introduce los nuevos datos (vacío para no cambiar):");
        Pantalla.escribirSaltoLinea();

        String nAncho = Teclado.leerString("Ancho (actual: " + ancho + "): ");
        try {
            this.ancho = Integer.parseInt(nAncho);
        } catch (NumberFormatException e) {
            Pantalla.escribirString("Datos no actualizados");
        }
        Pantalla.escribirSaltoLinea();

        String nAlto = Teclado.leerString("Alto (actual: " + alto + "): ");
        try {
            this.alto = Integer.parseInt(nAlto);
        } catch (NumberFormatException e) {
            Pantalla.escribirString("Datos no actualizados");
        }
        Pantalla.escribirSaltoLinea();

        Pantalla.escribirString("Introduce el nuevo centro (actual: X=" + centro.getX() + ", Y=" + centro.getY() + "):");
        String nX = Teclado.leerString("X: ");
        String nY = Teclado.leerString("Y: ");
        try {
            this.centro.setX(Integer.parseInt(nX));
            this.centro.setY(Integer.parseInt(nY));
        } catch (NumberFormatException e) {
            Pantalla.escribirString("Datos no actualizados");
        }
        Pantalla.escribirSaltoLinea();

        String nColor = Teclado.leerString("Color (actual: " + color + "): ");
        try {
            this.color = Integer.parseInt(nColor);
        } catch (NumberFormatException e) {
            Pantalla.escribirString("Datos no actualizados");
        }
        Pantalla.escribirSaltoLinea();

        Pantalla.escribirString("Datos actualizados:");
        Pantalla.escribirSaltoLinea();

        
    }
}
