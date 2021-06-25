package src.vehiculos.camioneta;

import src.vehiculos.Vehiculo;
import src.vehiculos.vehiculosCarga.VCarga;
import src.vehiculos.vehiculosCarrera.VCarrera;

public class Camioneta extends Vehiculo implements ComportamientoCamioneta{

    public Camioneta(String combustible, int galonesGasofa, int cantidadPasajeros, double velocidadMaxima, double aceleracionBase){
        this.combustible = combustible;
        this.galonesGasofa = galonesGasofa;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }

    public void definir(Vehiculo vehiculo) {
        if(vehiculo instanceof VCarga){
            System.out.println("VEHICULO DE CARGA PESADA");
        }
        else if(vehiculo instanceof VCarrera){
            System.out.println("VEHICULO DE CARRERA, AUMENTA SU ACELERACIÓN");
        }
        else if(vehiculo instanceof Camioneta){
            System.out.println("CAMIONETA, CARGA GENTE");
        }
        else {
            System.out.println("NO SE RECONOCE");
        }
    }

    public void girarDerecha() {
        System.out.println("\nEL VEHICULO GIRO A LA DERECHA\n");
    }

    public void girarIzquierda() {
        System.out.println("\nEL VEHICULO GIRO A LA IZQUIERDA\n");
    }

    public void transportarPersonas() {
        System.out.println("\nCAMIONETA CON CAPACIDAD DE 50 PERSONAS \n");
        this.cantidadPasajeros = 50;
    }
    
}
