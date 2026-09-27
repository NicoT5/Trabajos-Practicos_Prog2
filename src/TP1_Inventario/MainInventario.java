package TP1_Inventario;

public class MainInventario {
    public static void main(String[] args) {
       Producto productoUno = new Producto("Leche", "Leche01", 1500.0, 300);
       Producto productoDos = new Producto("Harina", "Harina29", 1340.0, 138);
       Producto productoTres = new Producto("Fideos", "Fideos99", 980.0, 279);

       productoUno.mostrarFicha();
       productoUno.venderUnidades(3);
       productoUno.reponerStock(20);
       productoUno.actualizarPrecio(800.0);

       productoDos.mostrarFicha();
       productoDos.venderUnidades(17);
       productoDos.reponerStock(30);
       productoDos.actualizarPrecio(1790.0);

       productoTres.mostrarFicha();
       productoTres.venderUnidades(15);
       productoTres.reponerStock(50);
       productoTres.actualizarPrecio(870.0);

       Producto copia = productoTres;
       copia.stock = 890;
       System.out.println("productoTres.stock: " + productoTres.stock);

       productoUno.mostrarFicha();
       productoUno.venderUnidades(359);
       productoUno.reponerStock(-70);
       productoUno.actualizarPrecio(800.0);

       productoUno.mostrarFicha();
       productoUno.venderUnidades(0);
       productoUno.reponerStock(0);
       productoUno.actualizarPrecio(0);

       
    }
}