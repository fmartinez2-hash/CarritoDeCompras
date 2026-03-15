import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Gestiona la colección de ítems y el cálculo de costes.
 */
public class CarritoDeCompras {
    // Estructura eficiente: Item como clave, Cantidad como valor
    private final Map<Item, Integer> items;
    
    // Constantes de impresión (Hiperparámetros)
    private static final String SIMBOLO_MONEDA = "€";
    private static final String CABECERA_DETALLE = "--- Detalles del Carrito ---";

    public CarritoDeCompras() {
        this.items = new LinkedHashMap<>();
    }

    public void agregarItem(Item item, int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        items.put(item, items.getOrDefault(item, 0) + cantidad);
    }

    public void removerItem(Item item) {
        if (!items.containsKey(item)) {
            throw new NoSuchElementException("El ítem no existe en el carrito.");
        }
        items.remove(item);
    }

    /**
     * Calcula el total de la compra de forma independiente.
     */
    public double calcularTotal() {
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrecio() * e.getValue())
                .sum();
    }

    public void imprimirDetalle() {
        System.out.println(CABECERA_DETALLE);
        items.forEach((item, cantidad) -> 
            System.out.println(item.toString() + " | Cantidad: " + cantidad)
        );
        System.out.println("Total: " + calcularTotal() + " " + SIMBOLO_MONEDA);
    }
}