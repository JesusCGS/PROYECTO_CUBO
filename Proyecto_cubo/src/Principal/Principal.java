/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dominio.Cubo;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
     //instancio un cubo
    static Cubo c1= new Cubo(12,2,4);
    
    public static void main(String[] args) {
       
        //llaamo al metodo calcular volumen
      int res = c1.CalcularVolumen(c1.getAlto(), c1.getAncho(), c1.getProfundo());
        System.out.println("el resultado del volumen:"+res);
    }
    
}
