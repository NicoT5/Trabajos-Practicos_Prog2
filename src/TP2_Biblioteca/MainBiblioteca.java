package TP2_Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libroUno = new Libro("El Quijote", "Lucas Sosa", "libro-a1", 18, 26000.0);
        Libro libroDos = new Libro("El Principito", "Pablo Ramos", "libro-a2");
        Libro libroTres = new Libro("Dark", "Nestor Ortega", "libro-a3", 39, 139000.0);
    
        Libro libroCuatro = new Libro("", "Santiago Medina", "libro-a4", 80, 1000.0);
         
        boolean precioAceptado = libroUno.setPrecioReposicion(-1900.0);
        System.out.println("¿Se acepto el precio -1500.0? " + precioAceptado);
        System.out.println();

        libroUno.mostrarFicha();
        libroDos.mostrarFicha();
        libroTres.mostrarFicha();

        libroDos.prestar();
        libroDos.prestar();

        libroDos.devolver();
        
        double precioAnterior = libroUno.getPrecioReposicion();
        if (libroUno.setPrecioReposicion(18000.0)) {
            System.out.println("Precio de reposicion actualizado de \"" + libroUno.getTitulo() + "\": $" + precioAnterior + " -> $" + libroUno.getPrecioReposicion());
        }
        
    }
}
