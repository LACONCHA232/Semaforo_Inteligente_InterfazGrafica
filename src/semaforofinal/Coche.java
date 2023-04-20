/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semaforofinal;

import java.util.Observable;
import java.util.Random;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author diego
 */
public class Coche extends Observable implements Runnable{
    
    public JLabel label;
    public int nombre;
    public int Carril = 0;
    public static int contador = 0;
    Random random = new Random();
    
    public Coche(int nombre){
        this.nombre = nombre;
    }
    
    public int getNombre(){
        return nombre;
    }
    
    
    /// hacer que en lugar de poner numeros negativos, ponga solo 0; SHA
    // hacer que en cada JLabel aparezcan los coches formados y se actualicen conforme cambien (con un observer)
    
    public static void Semaforo(Coche hilo1, Coche hilo2, Coche hilo3, Coche hilo4, Thread hilo) throws InterruptedException{
        
        while(hilo.isAlive()){
            if(hilo1.Carril > hilo2.Carril && hilo1.Carril > hilo3.Carril && hilo1.Carril > hilo4.Carril){
                Thread.sleep(1000);
                hilo1.Carril = hilo1.Carril - 2;
                if(hilo1.Carril < 0){
                    hilo1.Carril = 0;
                }
                System.out.println("El semaforo Norte esta en VERDE y los demas (E,S,O) estan en rojo");
                System.out.println("El carril Norte(1) tiene: "+ hilo1.Carril+ " tenia: "+(hilo1.Carril+2)+" y alcanzaron a pasar 2 coches");
            }
            else if(hilo2.Carril > hilo1.Carril && hilo2.Carril > hilo3.Carril && hilo2.Carril > hilo4.Carril){
                Thread.sleep(1000);
                hilo2.Carril = hilo2.Carril - 2;
                if(hilo2.Carril < 0){
                    hilo2.Carril = 0;
                }
                System.out.println("El semaforo Este esta en VERDE y los demas (N,S,O) estan en rojo");
                System.out.println("el carril Este(2) tiene: "+ hilo2.Carril+ " y tenia: "+(hilo2.Carril+2)+" y alcanzaron a pasar 2 coches");
            }
            else if(hilo3.Carril > hilo1.Carril && hilo3.Carril > hilo2.Carril && hilo3.Carril > hilo4.Carril){
                Thread.sleep(1000);
                hilo3.Carril = hilo3.Carril - 2;
                if(hilo3.Carril < 0){
                    hilo3.Carril = 0;
                }
                System.out.println("El semaforo Sur esta en VERDE y los demas (E,N,O) estan en rojo");
                System.out.println("el carril Sur(3) tiene: "+ hilo3.Carril+ " y tenia: "+(hilo3.Carril+2)+" y alcanzaron a pasar 2 coches");
            }
            else if(hilo4.Carril > hilo1.Carril && hilo4.Carril > hilo2.Carril && hilo4.Carril > hilo3.Carril){
                Thread.sleep(1000);
                hilo4.Carril = hilo4.Carril - 2;
                if(hilo4.Carril < 0){
                    hilo4.Carril = 0;
                }
                System.out.println("El semaforo Oeste esta en VERDE y los demas (E,S,N) estan en rojo");
                System.out.println("el carril Oeste(4) tiene: "+ hilo4.Carril+ " y tenia: "+(hilo4.Carril+2)+ " y alcanzaron a pasar 2 coches");
            }
        }
    }

    
    public int Random(){
        int NumeroR = 0;
        for(int i=0;i<3;i++){
            NumeroR = random.nextInt(0,2);
        }
        return NumeroR;
    }
    


    @Override
    public void run() {

        while(true){
            
            if(Random() == 0){
                
                try {
                    Carril = Carril + 1;
                    
                    this.setChanged();
                    this.notifyObservers(Carril);
                    this.clearChanged();
                    
                    if(Carril < 0){
                        Carril = 0;
                    }
                    if(Carril >= 3){
                        Carril = 3;
                    }
                    Thread.sleep(3000);  //// en la consola se puede ver algunas veces que por el sleep, el mensaje de la funcion Semaforo se imprime mas rapido y puede aparecer antes del reporte de "el semaforo a aumentado en x"
                } catch (InterruptedException ex) {
                    Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("El semaforo aumento en " + "1" + " y tiene " + Carril + " coches");
            }
            else if(Random() == 1){
                
                try {
                    Carril = Carril + 2;
                    
                    this.setChanged();
                    this.notifyObservers(Carril);
                    this.clearChanged();
                    
                    if(Carril < 0){
                        Carril = 0;
                    }
                    if(Carril >= 3){
                        Carril = 3;
                    }
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("El semaforo aumento en " + "2" + " y tiene " + Carril + " coches");
            }

        }

    }
    
}
