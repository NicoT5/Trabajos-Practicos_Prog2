package TP3_Flota;

public class Camion extends Vehiculo{
    
    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override 
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * (1 + capacidadToneladas * 0.05);
    }

    @Override
    public void mostrarFicha() {
        System.out.print("[Vehículo] Camión | ");
        super.mostrarFicha();
        System.out.println(" | Toneladas: " + capacidadToneladas);
    }
}
