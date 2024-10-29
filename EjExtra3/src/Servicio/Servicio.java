package Servicio;

import Entidad.Vehiculo;
import Entidad.Cliente;
import Entidad.CuotasPoliza;
import Entidad.Poliza;
import static Enum.EnumMetodosDePago.debito;
import static Enum.EnumMetodosDePago.efectivo;
import static Enum.EnumMetodosDePago.transferencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Servicio {
   
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
     ArrayList<Cliente>listaClientes= new ArrayList();
     ArrayList<Vehiculo> listaVehiculos= new ArrayList();
     ArrayList<CuotasPoliza>listaCuotas=new ArrayList();
     ArrayList<Poliza> listaPoliza=new ArrayList();
      
    
    public void clienteNuevo(){
        
        String letra="";
        do {
             Cliente c1= new Cliente();
            
            System.out.println("bienvenido,ingrese su nombre");
            c1.setNombre(leer.next());
            System.out.println("ingrese su apellido");
            c1.setApellido(leer.next());
            System.out.println("ingrese su nro de documento");
            c1.setDocumento(leer.nextInt());
            System.out.println("ingrese su direccion de correo electronico");
            c1.setMail(leer.next());
            System.out.println("ingrese su direccion de domicilio");
            c1.setDomicilio(leer.next());
            System.out.println("ingrese su numero de telefono");
            c1.setTelefono(leer.nextInt());
            
            listaClientes.add(c1);
            System.out.println("desea registrar otro cliente nuevo(si/no)?");
            letra=leer.next();
        } while (letra.equalsIgnoreCase("si"));
    }

    public void vehiculoNuevo(){
        
        String letra="";
        do {
            Vehiculo v1= new Vehiculo();
            System.out.println("ingrese la marca del vehiculo  a registrar");
            v1.setMarca(leer.next());
            System.out.println("ingrese modelo del auto a registrar");
            v1.setModelo(leer.next());
            System.out.println("ingrese año del vehiculo a registrar");
            v1.setAnio(leer.nextInt());  
            System.out.println("ingrese el numero de motor del auto a registrar");
            v1.setNumeroMotor(leer.nextInt());
            System.out.println("ingrese el codigo de chasis del auto a registrar");
            v1.setChasis(leer.next());
            System.out.println("ingrese color del auto a registrar");
            v1.setColor(leer.next());
            System.out.println("ingrese el tipo de auto a registrar");
            v1.setTipo(leer.next());
           
            listaVehiculos.add(v1);
            System.out.println("desea registrar mas vehiculos(si/no)?");
            letra=leer.next();
            
        } while (letra.equalsIgnoreCase("si"));
        
    }
        
        public void nuevaPoliza(){
            
            String letra="";
            Integer cont=0;
            Integer contadorDate=0;
            
        
            
            do {
                
                Poliza p1= new Poliza();
                System.out.println("ingresar datos de la poliza");
                
                System.out.println("numero de poliza");
                p1.setNumeroPoliza(cont++);
                System.out.println(cont);
                System.out.println("fecha de inicio de poliza");
                Date fechaInicio= new Date();
               
                p1.setFechaInicioPoliza(fechaInicio);
                System.out.println(p1.getFechaInicioPoliza());
                
                System.out.println("fecha de vencimiento de poliza");
                Date fechaFinalVencimiento= new Date();
            
                
                 p1.setFechaFinPoliza(p1.getFechaFinPoliza());
                 
                 System.out.println("ingrese que cobertura quiere tener?");
                 p1.setTipoCobertura(leer.next());
                 System.out.println("monto asegurado en total");
                 p1.setMontoTotalAsegurado(leer.nextInt());
                 
                 System.out.println("quiere asegurarse contra el granizo?");
                 
                 if (leer.next().equalsIgnoreCase("si")){
                     p1.setGranizo(true);  
                     System.out.println("ingrese el monto de poliza contra ganizo");
                         p1.setMontoMaximoGranizo(leer.nextDouble());
                 }else{
                   p1.setGranizo(false);
                 }
            
                 listaPoliza.add(p1);
                 
                System.out.println("desea adquirir otra poliza?(si/no)");
                letra=leer.next();
            
            }while(letra.equalsIgnoreCase("si"));
            
        }
            
           
        
        public void cuotasPoliza(){
                
            String letra="";
       
            int opcion=0;  
            
           
            
              do {
                    
                    CuotasPoliza cuota= new CuotasPoliza();
                    
                    System.out.println("indique el numero de cuota de poliza");
                    cuota.setNumeroCuota(leer.nextInt());
                   
                    System.out.println("indique monto total de la cuota");
                    cuota.setMontoTotalCuota(leer.nextDouble());
                    
                    System.out.println("indique si la cuota fue abonada o no");

                     if(leer.next().equalsIgnoreCase("si")){
                        cuota.setPagoRealizado(true);
                     }else{ 
                         cuota.setPagoRealizado(false);
                     }
                    
                     System.out.println("indique fecha de vencimiento de la cuota");
                     
                     Date fechaVencimientoCuota= new Date();
                     
                     cuota.setFechaDeVencimiento(cuota.getFechaDeVencimiento());
                    
                     
                    
                   
                    do {
                        System.out.println("indique metodo de pago de la cuota");
                 
                        System.out.println("1-Opcion 1: efectivo");
                        System.out.println("2-Opcion 2: transferencia");
                        System.out.println("3-Opcion 3: debito");
                        System.out.println("Elija una opcion:");
                        opcion = leer.nextInt();
                        
                        switch (opcion) {
                            case 1:
                                cuota.setMetodosDePago(efectivo);
                                break;
                            case 2:
                                cuota.setMetodosDePago(transferencia);
                                break;
                            case 3:
                                cuota.setMetodosDePago(debito);
                                break;
                            case 4:
                                 System.out.println("hasta luego....");
                                break;
                            default:
                                System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                                break;
                        }

                    } while (!(opcion == 4));
                    
                       listaCuotas.add(cuota);
         
                       System.out.println("desea ingresar mas informacion (si/no)?");
                       letra=leer.next();
 
            } while (letra.equalsIgnoreCase("si"));
            
                
//          a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//domicilio, teléfono.      
//                

        }

               
          public ArrayList<Cliente> gestionIntegralDeClientes(){
              
              return listaClientes;
       
          }

//          b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
          
          public ArrayList<Vehiculo>  gestionDeVehiculos(){
              
              return listaVehiculos;
         
            }
          
          public ArrayList<Poliza> gestionPolizas(){
              
              return listaPoliza;
          }
            
          public ArrayList<CuotasPoliza> gestionDeCuotas(){
              
              return listaCuotas;
              
          }
          
          
            }

                    
       
        
       
        
  

