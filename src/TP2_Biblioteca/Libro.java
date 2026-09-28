package TP2_Biblioteca;

public class Libro {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Sin titulo";
            System.out.println("Titulo invalido, se uso Sin titulo por defecto.");           
        }
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            this.autor = "Autor desconocido";
            System.out.println("Autor invalido, se uso Autor desconocido por defecto.");           
        }
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            this.isbn = "ISBN pendiente";
            System.out.println("ISBN invalido, se uso ISBN pendiente por defecto.");
        }

        if (copiasDisponibles > 0) {
            this.copiasDisponibles = copiasDisponibles;
        } else {
            this.copiasDisponibles = 0;
            System.out.println("Copias disponibles invalidas, se usó 0 por defecto.");
        }
        
        this.precioReposicion = 15000.0; 
        boolean aceptado = setPrecioReposicion(precioReposicion); 
        if (!aceptado) { 
            System.out.println("Precio de reposicion invalido, se uso 15000.0 por defecto.");
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean setPrecioReposicion(double precio) {
        if (precio > 0) {
            this.precioReposicion = precio;
            return true;
        }
        return false;
    }

   
    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Prestamo registrado: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
            return true;
        } else {
            System.out.println("Error: no hay copias disponibles de \"" + titulo + "\" para prestar.");
            return false;
        }
    }

    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolucion registrada: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
    }

    public void mostrarFicha() {
        System.out.println("=== Ficha de libro ===\n" +
                           "Título:  " + titulo + "\n" +
                           "Autor:   " + autor + "\n" +
                           "ISBN:    " + isbn + "\n" +
                           "Copias disponibles: " + copiasDisponibles + "\n" +
                           "Precio de reposicion: $" + precioReposicion + "\n" +
                           "=======================");
    }
}
