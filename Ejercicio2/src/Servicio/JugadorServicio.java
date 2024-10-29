/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class JugadorServicio {
    
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
      Revolver r=new Revolver();
    RevolverServicio revolver= new RevolverServicio();
 
      public ArrayList<Jugador>nuevoJugador(){
     
          String opcion;
       ArrayList<Jugador>lista=new ArrayList();
       int contador=0;
    
          do {
                System.out.println("inserte datos");
        Jugador j1=new Jugador();
        contador++;
        
        j1.setId(leer.nextInt());
        j1.setNombre(leer.next());
        j1.setMojado(false);
        
       lista.add(j1);
              System.out.println("quiere agregar otro jugador");
              opcion=leer.next();
          } while (opcion.equalsIgnoreCase("si") || contador==6);
          
      
        
        return lista;
    
    }
    
    
    
    
   
     public Boolean Disparo(RevolverServicio revolver,Jugador j1){
     
         boolean disparo;
         
     revolver.mojar(r);
     
     
     if (revolver.mojar(r)==true){
     
      j1.setMojado(true);
     
     return disparo=true;
     
     }else{
     j1.setMojado(false);
     revolver.siguienteChorro(r);
     
     return disparo=false;
     
     }
 
     
     }
    
    
}
