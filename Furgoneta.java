package TP3_Flota;

public class Furgoneta extends Vehiculo{
    
    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm,  boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override 
    public double calcularCostoViaje(double distanciaKm) {
        if (tieneRefrigeracion) {
            return super.calcularCostoViaje(distanciaKm) + 5000.0;
        } else {
            return super.calcularCostoViaje(distanciaKm);
        }
    }

    @Override
    public void mostrarFicha() {
        System.out.print("[Vehículo] Furgoneta | ");
        super.mostrarFicha();
        System.out.println(" | Refrigerado: " + (tieneRefrigeracion ? "Sí" : "No"));
    }

}
