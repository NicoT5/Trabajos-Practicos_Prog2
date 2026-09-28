package TP1_Inventario;

public class Producto {
    
    public String nombre;
    public String codigo;
    public double precio;  
    public int stock;

    public Producto(String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }
    public void venderUnidades(int cantidad) {   
            if (cantidad > 0 && cantidad <= stock) { 
                stock -= cantidad;
                System.out.println("Venta realizada: " + cantidad + "  unidades de " + nombre + ". Stock restante: " + stock);
            } else {
                System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
            }
    }   
    public void reponerStock(int cantidad) {
          if (cantidad > 0) {
              stock += cantidad;
              System.out.println("Reposicion registrada: +" + cantidad + " unidades. Stock actual: " + stock);              
          }else{
              System.out.println("Error: cantidad invalida");
          }
    }
        
    public void actualizarPrecio(double precio) { 
        if (precio > 0) {
        double  precioAnterior = this.precio;
        this.precio = precio;
        System.out.println("Precio actualizado de " + nombre + " de $" + precioAnterior + " -> $" + precio);
        }else{
            System.out.println("Error: precio invalido");
        }
    }
    public void mostrarFicha() { 
        System.out.println("--- Ficha de producto ---\n" +
                   "Nombre: " + nombre + "\n" +
                   "Codigo: " + codigo + "\n" +
                   "Precio: $" + precio + "\n" +
                   "Stock: " + stock + "\n" +
                   "--------------------------" + "\n" );
                   
        }
    }

