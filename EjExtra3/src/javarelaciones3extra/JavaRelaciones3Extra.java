package javarelaciones3extra;


import Entidad.Cliente;
import Entidad.CuotasPoliza;
import Entidad.Poliza;
import Entidad.Vehiculo;
import Servicio.Servicio;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaRelaciones3Extra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Servicio a1= new Servicio();
        
        a1.clienteNuevo();
        a1.vehiculoNuevo();
        a1.nuevaPoliza();
        a1.cuotasPoliza();
        
       ArrayList<Cliente>s=a1.gestionIntegralDeClientes();
        ArrayList<Vehiculo>sw= a1.gestionDeVehiculos();
         ArrayList<Poliza>sf=a1.gestionPolizas();
        ArrayList<CuotasPoliza>sb= a1.gestionDeCuotas();
        
    }
}
