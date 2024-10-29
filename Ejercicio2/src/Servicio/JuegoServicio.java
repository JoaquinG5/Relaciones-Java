package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     
    RevolverServicio revo=new RevolverServicio();
    JugadorServicio j=new JugadorServicio();
    Juego j1=new Juego();
    
    
   public void llenarJuego(){
  
    
       j1.setListaJugadores(j.nuevoJugador());
       
       for (Jugador aux : j1.getListaJugadores()) {
           System.out.println(aux);
       }
       
       revo.llenarRevolver();
       
   }
    
    public void Ronda(Revolver r){
        
        System.out.println("ronda de disparos");
        boolean juego=false;
       
       
      while(juego==false){
       
       for (Jugador aux : j1.getListaJugadores()) {
    
            if((j.Disparo(revo, aux)==true) && (aux.isMojado()==true)){
              
                juego=true;
                System.out.println("esta mojado");
                break;
            
            }else{
            
                System.out.println("no esta eliminado");
            
            
            }
      
      }
       
        }
    
    
    
    }
}
