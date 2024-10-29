
package javarelaciones1;
import Perro.ClasePerro;
import Persona.ClasePersona;
import java.util.Scanner;


 
public class JavaRelaciones1 {
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     ClasePerro perro1= new ClasePerro("lucky", "salchicha","chiquito", 10);
     ClasePerro perro2= new ClasePerro("jose", "golden" , "grande", 8);
  
     ClasePersona persona1= new ClasePersona("pedro", "gonzalez",perro1);
     ClasePersona persona2= new ClasePersona("juan","fernandez",perro2);
     
    
        System.out.println(persona1);
        System.out.println(persona2);
     
        
    }

}
