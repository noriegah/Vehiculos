package src.vehiculos;

public abstract class Vehiculo implements ComportamientosVehiculos{
    protected String combustible;
    protected int galonesGasofa;
    protected int cantidadPasajeros;
    protected double velocidadMaxima;
    protected double aceleracionBase;

    public abstract void definir(Vehiculo vehiculo);

    public String toString() {
        return "Combustible: " + combustible + " Galones de gasolina: "+ galonesGasofa + " Velocidad Maxima: " + velocidadMaxima + " Aceleracion Base: " + aceleracionBase;
    }

}
