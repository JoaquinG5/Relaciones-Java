/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones4;

/**
 *
 * @author LILIANA
 */
public class Persona {

   
  private String nombre;
  private String apellido;
  private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
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

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", apellido= " + apellido + ", perrito: " + perro ;
    }
  
   

   
}
