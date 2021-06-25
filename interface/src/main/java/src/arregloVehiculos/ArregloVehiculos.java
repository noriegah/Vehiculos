package src.arregloVehiculos;

import src.vehiculos.Vehiculo;
import src.vehiculos.vehiculosCarga.*;
import src.vehiculos.vehiculosCarrera.*;
import src.vehiculos.camioneta.*;

public class ArregloVehiculos {
    private Vehiculo[] vehiculos;
    private int cantidadVehiculos = 0;

    public ArregloVehiculos(){
        vehiculos = new Vehiculo[20];
    }

    public void menu(){
        int opcion; 
        llenarArreglo();
        do{
            System.out.println("-------------MENU-------------");
            System.out.println("");
            System.out.println("1) ESCOGER VEICULO");
            System.out.println("2) SALIR");
            opcion = IngresoDatos.getInt("Por favor digite una opcion");

            if(opcion == 1){
                escogerArreglo();
            }
        } while(opcion != 2);
  
    }

    public void escogerArreglo(){
        int escoger;
        int escoger2;
        do{
            mostrarArreglo();
            escoger = IngresoDatos.getInt("\nEscoja el vehiculo que desea ver ");
            if(escoger <= 20){
                for (int i = 0; i < vehiculos.length; i++) {
                    if(i == (escoger - 1)){
                        do{
                            System.out.println("");
                            System.out.println("1) GIRAR A LA DERECHA");
                            System.out.println("2) GIRAR A LA IZQUIERDA");
                            System.out.println("3) MOSTRAR TIPO DE VEHICULO");        
                            System.out.println("4) REGRESAR AL MENU ");
                            escoger2 = IngresoDatos.getInt("DIGITE UNA OPCION");
                            if(escoger2 == 1){
                                vehiculos[i].girarDerecha();
                            }
                            else if(escoger2 == 2){
                                vehiculos[i].girarIzquierda();
                            }
                            else if(escoger2 == 3){
                                vehiculos[i].definir(vehiculos[i]);
                            }
                        }while(escoger2 != 4);
                       
                        
                    }
                }
                System.out.println("\n");
            }
            else{
                System.out.println("NO EXIST EEL VEHICULO");
            }
        } while(escoger !=21);
        
        
    }

    public void llenarArreglo(){
        int random = generarNumeroRandom(1, 3);

        while(cantidadVehiculos < 20){
            if(random == 1){
                vehiculos[cantidadVehiculos] = new VCarga("GAS", 10, 2, 90, 4.5);
            }
            else if(random == 2){
                vehiculos[cantidadVehiculos] = new VCarrera("DIESEL", 9, 2, 335, 11.6);
            }
            else if(random == 3){
                vehiculos[cantidadVehiculos] = new Camioneta("DIESEL", 12, 2, 80, 3.25);
            }
            random = generarNumeroRandom(1, 3);
            cantidadVehiculos++;
        }

    }

    public void mostrarArreglo(){
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println((i+1) + ")\t" + vehiculos[i].toString());
        }
        System.out.println("21)\tREGRESAR MENU ");
    }

    public int generarNumeroRandom(int minimo, int maximo){
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}
