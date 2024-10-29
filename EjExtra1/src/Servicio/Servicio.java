/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class Servicio {

      Scanner leer = new Scanner(System.in).useDelimiter("\n");

 ArrayList<Persona> nuevaPersona= new ArrayList();
ArrayList<Perro> nuevoPerro= new ArrayList();
  
   public void crearPersona(){
  
          String letra="";
  
       do {
           Persona p1= new Persona();
           System.out.println("ingrese nombre de persona");
           p1.setNombre(leer.next());
           System.out.println("ingrese apellido");
           p1.setApellido(leer.next());
           
           nuevaPersona.add(p1);
            System.out.println("quiere ingresar otra persona(S/n)");
           letra=leer.next();
      
       } while (letra.equalsIgnoreCase("s"));
  
    }
    
   public void crearPerro(){
       
   
     String letra="";
       do {
           
           Perro perro1=new Perro();
           
           System.out.println("ingrese nombre de perro");
           perro1.setNombre(leer.next());
           System.out.println("ingrese raza de perro");
           perro1.setRaza(leer.next());
           System.out.println("ingrese tamaño de perro");
           perro1.setTamaño(leer.next());
           System.out.println("ingrese edad");
           perro1.setEdad(leer.nextInt());
           nuevoPerro.add(perro1);
           System.out.println("quiere crear mas perros(s/n");
            letra=leer.next();

        } while (letra.equalsIgnoreCase("S"));
    }     


   public void adoptarPerro(){
       
       System.out.println("vamos a adoptar un perro de la calle");
      
       List<Perro> perroAdoptado= new ArrayList();
       
       String letra="";
       int cont=0;
       
       do {
          System.out.println("ingrese el nombre de la persona que adoptara el perro");
           String nombre=leer.next();
           for (Persona aux :nuevaPersona) {
               if(nombre.equalsIgnoreCase(aux.getNombre())){
               System.out.println("ingrese el nombre del perro que quiere adoptar");
               String nombrePerro=leer.next();
               
               for (Perro p2 : nuevoPerro) {
                   if(nombrePerro.equalsIgnoreCase(p2.getNombre())){
                   aux.setPerro(p2);
                   perroAdoptado.add(p2);
                   
                   cont++;
                }
               }    
               if(cont==0){
                   System.out.println("el perro que ingreso no se encuentra disponible");
               }
               cont=0;
          
           }
           }
       
               System.out.println("quiere adoptar otro perro?(si/no)");
               letra=leer.next();
               
       } while (letra.equalsIgnoreCase("si"));
       nuevoPerro.removeAll(perroAdoptado);
       }


   
     public void mostrarPersonas(){
         
         for (Persona p: nuevaPersona) {
             System.out.println(p);
         }
         
         for (Perro p2 : nuevoPerro) {
             System.out.println(p2);
         }
         
     }
             }


 
         


