/**
 * Representa un producto individual en la tienda.
 * @author Floren
 */
public class Item {
    private String nombre;
    private double precio;

    // Constantes para límites de negocio (Hiperparámetros)
    private static final double PRECIO_MINIMO = 0.0;
    private static final double PRECIO_MAXIMO = 10000.0;

    public Item(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < PRECIO_MINIMO || precio > PRECIO_MAXIMO) {
            throw new IllegalArgumentException("Precio fuera de rango permitido (0 - 10000).");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", nombre, precio);
    }
}