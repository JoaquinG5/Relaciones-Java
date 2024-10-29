/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Juego;
import Entidades.Revolver;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import Servicio.RevolverServicio;

/**
 *
 * @author LILIANA
 */
public class ClasePrincipal {
     public static void main(String[] args) {
       
           JugadorServicio j=new JugadorServicio();

        JuegoServicio jota=new JuegoServicio();
        
        RevolverServicio rev=new RevolverServicio();
        Juego u=new Juego();
        Revolver re= new Revolver();
 
       jota.llenarJuego();
 
    jota.Ronda(re);
        
    }
 
}
