/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    private int alto;
    private int ancho;
    private int profundo;

   //getter

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getProfundo() {
        return profundo;
    }
    //setter

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    //coonstructor vacio

    public Cubo() {
    }

    public Cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
//toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }
    
    public int CalcularVolumen(int alto,int ancho,int profundo){
       return  alto* ancho* profundo;
    }
    
    
    
}
