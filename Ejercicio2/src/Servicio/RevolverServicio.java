/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Revolver;

/**
 *
 * @author LILIANA
 */
public class RevolverServicio {
    
     public Revolver llenarRevolver(){
    
           Revolver r=new Revolver();
    
      System.out.println("llenar el revolver de agua");
        
        r.setPosicionActual((int) Math.random()*6);
        r.setPosicionAgua((int) Math.random()*6);
    
    
        System.out.println("posiciones " + r.getPosicionActual() + " " + r.getPosicionAgua());
        return r;
    }
    
    public boolean mojar(Revolver r){
    
    
        System.out.println("mostrar si coinciden la posion actual con la posicion de agua");
        
        boolean c;
        
        if(r.getPosicionActual()==r.getPosicionAgua()){
         
          System.out.println("coinciden en la misma posicion");
            
        return c=true;
        
           
        }else{
         System.out.println("no coinciden en la misma posicion");
        
         return  c=false;
          
        }
    }
    
    public void siguienteChorro(Revolver r){
    
        System.out.println("cambia a la siguiente posicion del tambor");
        
        System.out.println("mostrar posicion actual del tambor " + r.getPosicionActual());
        
        
        if(r.getPosicionActual()==5){
        
        r.setPosicionActual(0);
        }else{
        
        r.setPosicionActual((r.getPosicionActual()) + 1);
        }
     
    
        System.out.println("nueva posicion de tambor " + r.getPosicionActual());
    
    }
    
    public void revolver(Revolver r){
    
        System.out.println("mostrar posicion actual y posicion de Agua");
        System.out.println(r.toString());    
    }
    
    
    
}
