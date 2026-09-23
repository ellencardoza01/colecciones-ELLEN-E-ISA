
package productos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorProductos gestor = new GestorProductos();
        int opcion;

        do {
            System.out.println("MENU DE PRODUCTOS");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar precio");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    gestor.agregarProducto(new Productos(id, nombre, precio));
                    break;

                case 2:
                    gestor.mostrarProductos();
                    break;

                case 3:
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar = sc.nextInt();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();
                    if (gestor.actualizarProducto(idActualizar, nuevoPrecio)) {
                        System.out.println("Producto actualizado.");
                    } else {
                        System.out.println("No se encontro ese ID.");
                    }
                    break;

                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (gestor.eliminarProducto(idEliminar)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("No se encontro ese ID.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}