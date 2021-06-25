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

    public void girarDerecha() {
        System.out.println("\nEl vehículo giró a la derecha\n");
    }

    public void girarIzquierda() {
        System.out.println("\nEl vehículo giró a la izquierda\n");
    }

    public void transportarPersonas() {
        System.out.println("\nLas camionetas transportan hasta 50 personas \n");
        this.cantidadPasajeros = 50;
    }
    
}
