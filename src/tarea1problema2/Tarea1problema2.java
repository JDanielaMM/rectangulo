/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1problema2;
import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Tarea1problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner key = new Scanner (System.in);
     double base, altu, per,sup;
     
        System.out.println("Escribe la base del rectángulo: ");
        base = key.nextDouble();
        System.out.println("Escribe la altura del rectángulo: ");
        altu = key.nextDouble();
        
        per = (base*2)+(altu*2);
        sup = base*altu;
        
        System.out.println("El perímetro del rectángulo es: "+per);
        System.out.println("La superficie del rectángulo es: "+sup);
        
    
    }
    
}
