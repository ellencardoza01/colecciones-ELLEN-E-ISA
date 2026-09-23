
package productos;

import java.util.ArrayList;

public class GestorProductos {

    private ArrayList<Productos> productos = new ArrayList<>();

    // CREAR
    public void agregarProducto(Productos producto) {
        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    // LEER
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }
        for (Productos p : productos) {
            System.out.println(p);
        }
    }

    // ACTUALIZAR
    public boolean actualizarProducto(int id, double nuevoPrecio) {
        for (Productos p : productos) {
            if (p.getId() == id) {
                p.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }

    // ELIMINAR
    public boolean eliminarProducto(int id) {
        for (Productos p : productos) {
            if (p.getId() == id) {
                productos.remove(p);
                return true;
            }
        }
        return false;
    }
}