public class Main {
    public static void main(String[] args) {
        try {
            CarritoDeCompras miCarrito = new CarritoDeCompras();
            
            Item i1 = new Item("Camiseta", 20.99);
            Item i2 = new Item("Pantalones", 34.99);

            miCarrito.agregarItem(i1, 2); // Probamos la nueva funcionalidad de cantidad
            miCarrito.agregarItem(i2, 1);
            
            miCarrito.imprimirDetalle();
            
        } catch (Exception e) {
            System.err.println("Error en el proceso de compra: " + e.getMessage());
        }
    }
}