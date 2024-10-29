package Perro;

import Persona.ClasePersona;

public class ClasePerro{

    private String nombre;
    private String raza;
    private String tamaño;
    private Integer edad;

    public ClasePerro() {
    }

    public ClasePerro(String nombre, String raza, String tamaño, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "" + "nombre=" + nombre + ", raza=" + raza + ", tamanioo= " + tamaño + ", edad= " + edad + '}';
    }

     
  
}
    
    
