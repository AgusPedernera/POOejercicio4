/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciopractico4;

import entidad.Rectangulo;

/**
 *
 * @author tinap
 */
public class POOejerciciopractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        rec1.crearRectangulo();
        
        System.out.println("La superficie es " +rec1.calcularSuperficie());
        System.out.println("El perimetro es "+rec1.calcularPerimetro());
        
        rec1.dibujarRectangulo();
    }
    
}
