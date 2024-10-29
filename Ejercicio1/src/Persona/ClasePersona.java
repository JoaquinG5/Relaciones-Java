/*


Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona

 */
package Persona;

import Perro.ClasePerro;


public class ClasePersona {
   
  private String nombre;
  private String apellido;
  private ClasePerro perrito;

    public ClasePersona() {
    }

    public ClasePersona(String nombre, String apellido, ClasePerro perrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perrito = perrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ClasePerro getPerrito() {
        return perrito;
    }

    public void setPerrito(ClasePerro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", apellido= " + apellido + ", perrito :   " + perrito ;
    }
  
   

   

    
    
    
    
    
  
  
}      
        
        
 

