/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semaforofinal;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
        Visual visual = new Visual();
        visual.setVisible(true);
        

        Coche coche1 = new Coche(1);
        Coche coche2 = new Coche(2);
        Coche coche3 = new Coche(3);
        Coche coche4 = new Coche(4);
        

        visual.update(coche1, coche1.Carril);
        visual.update(coche2, coche2.Carril);
        visual.update(coche3, coche3.Carril);
        visual.update(coche4, coche4.Carril);
        
        
        
        
    }

    
}
