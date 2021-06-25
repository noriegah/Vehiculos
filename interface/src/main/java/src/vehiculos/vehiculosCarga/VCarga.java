package src.vehiculos.vehiculosCarga;

import src.vehiculos.Vehiculo;
import src.vehiculos.camioneta.Camioneta;
import src.vehiculos.vehiculosCarrera.VCarrera;

public class VCarga extends Vehiculo implements ComportamientoVCarga{


    public void definir(Vehiculo vehiculo) {
        if(vehiculo instanceof VCarga){
            System.out.println("Es un vehículo de Carga, puede cargar mercaderia pesada ");
        }
        else if(vehiculo instanceof VCarrera){
            System.out.println("Es un vehículo de Carrera, puede aumentar hasta 3 veces más su aceleracion base ");
        }
        else if(vehiculo instanceof Camioneta){
            System.out.println("Es una camioneta, carga muchas personas ");
        }
        else {
            System.out.println("Objeto no reconocido");
        }
    }

    public VCarga(String combustible, int galonesGasofa, int cantidadPasajeros, double velocidadMaxima, double aceleracionBase){
        this.combustible = combustible;
        this.galonesGasofa = galonesGasofa;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }

    public void girarDerecha() {
        System.out.println("\nEl vehículo giró a la derecha\n");
    }

    public void girarIzquierda() {
        System.out.println("\nEl vehículo giró a la izquierda\n");
    }

    public void transportarMaterial() {
        System.out.println("\nLos vehículos de carga podrán cargar material\n");
    }

}
