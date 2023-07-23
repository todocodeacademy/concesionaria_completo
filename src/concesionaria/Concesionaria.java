package concesionaria;

import java.util.Scanner;

public class Concesionaria {

    public static void main(String[] args) {
        
        
        //creamos vector de tipo vehículo para hacer uso de polimorfismo
        Vehiculo vectorVehiculos[] = new Vehiculo[10];
        
        //scanners para leer por teclado
        //para numeros
        Scanner tipoVehiculo = new Scanner(System.in);
        Scanner datosNumericos = new Scanner(System.in);
        //para texto
        Scanner datoVehiculo = new Scanner(System.in);
        
       // variables auxiliares
        int opcion=0;
        Auto aut = new Auto();
        Moto mot = new Moto();
        
        //leemos los vehículos por teclado
        for (int i=0; i<vectorVehiculos.length; i++) {
            System.out.println("Ingrese 1 si desea ingresar un Auto o 2 si desea ingresar una Moto");
            opcion = tipoVehiculo.nextInt();
            
            if (opcion == 1) {
                
                //leemos por teclado los datos del auto
                System.out.println("Ingrese los datos del Auto");
                System.out.println("Ingrese ID");
                aut.setIdVehiculo(datosNumericos.nextInt());
                System.out.println("Ingrese marca");
                aut.setMarca(datoVehiculo.nextLine());
                System.out.println("Ingrese modelo");
                aut.setModelo(datoVehiculo.nextLine());
                System.out.println("Ingrese color");
                aut.setColor(datoVehiculo.nextLine());
                System.out.println("Ingrese año de fabricación");
                aut.setAnioFabricacion(datoVehiculo.nextLine());
                System.out.println("Ingrese precio");
                aut.setPrecio(datosNumericos.nextDouble());
                System.out.println("Ingrese cantidad de asientos");
                aut.setCantidadAsientos(datosNumericos.nextInt());
                System.out.println("Ingrese cantidad de puertas");
                aut.setCantidadPuertas(datosNumericos.nextInt());
                System.out.println("Ingrese potencia de motor");
                aut.setPotenciaMotor(datoVehiculo.nextLine());
                
                //guardamos el auto
                vectorVehiculos[i] = aut;
                //reseteamos el objeto
                aut = new Auto();
                
            }
            else {
                if (opcion == 2) {
                    System.out.println("Ingrese los datos de la Moto");
                    System.out.println("Ingrese ID");
                    mot.setIdVehiculo(datosNumericos.nextInt());
                    System.out.println("Ingrese marca");
                    mot.setMarca(datoVehiculo.nextLine());
                    System.out.println("Ingrese modelo");
                    mot.setModelo(datoVehiculo.nextLine());
                    System.out.println("Ingrese color");
                    mot.setColor(datoVehiculo.nextLine());
                    System.out.println("Ingrese año de fabricación");
                    mot.setAnioFabricacion(datoVehiculo.nextLine());
                    System.out.println("Ingrese precio");
                    mot.setPrecio(datosNumericos.nextDouble());
                    System.out.println("Ingrese Cilindrada");
                    mot.setCilindrada(datoVehiculo.nextLine());
                    
                    //guardamos la moto
                    vectorVehiculos[i] = mot;
                    //reseteamos el objeto
                    mot = new Moto();
                }
                else {
                    System.out.println("Ingresó un tipo de vehículo no válido");
                    i = i-1; //descontamos uno del contador para que no cuente como que ingresamos un vehículo
                    //cuando en realidad es un número inválido.
                }
                    
            }
        
        }
        
        
        //mostramos por pantalla todos los vehículos cargados y sus datos generales
         for (int i=0; i<vectorVehiculos.length; i++) { 
             System.out.println(vectorVehiculos[i].toString());
         }
         
         System.out.println("-----------------------------------");
        
         //realizamos ordenamiento para buscar los 3 más caros
         //los primeros 3 van a ser los más caros
         
        for(int i=0;i<vectorVehiculos.length;i++) {
            for(int ii=0;ii<2-i;ii++) {
                if (vectorVehiculos[ii].getPrecio()<vectorVehiculos[ii+1].getPrecio()) {
                    Vehiculo aux;
                    aux=vectorVehiculos[ii];
                    vectorVehiculos[ii]=vectorVehiculos[ii+1];
                    vectorVehiculos[ii+1]=aux;
                }
            }
        }
    System.out.println("-----------------TOP 3 VEHÍCULOS------------------");
        //mostramos por pantalla los datos de los 3 vehículos más caros y hacemos el service.
         for (int i=0; i<3; i++) { 
             System.out.println(vectorVehiculos[i].toString());
             vectorVehiculos[i].hacerService();
         }
         
       
    }
    
}
