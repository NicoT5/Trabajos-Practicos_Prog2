package TP3_Flota;

public class MainFlota {
    public static void main(String[] args) {
        
        System.out.println("=== Reporte de Operaciones de Flota ===");

        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = new Camion("AI235NM", "Iveco", 3500, 10);
        flota[1] = new Furgoneta("AH987IK", "Chevrolet", 2500, true);
        flota[2] = new MotoEnvios("AC344LO", "Yamaha", 1500);

        double costoTotal = 0;

        for (Vehiculo v : flota) {
            v.mostrarFicha();
            
            System.out.println("Costo de viaje (" + 150.0 + " km): $" + v.calcularCostoViaje(150.0));
            System.out.println("--------------------------------------------------");

            costoTotal += v.calcularCostoViaje(150.0);
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}
