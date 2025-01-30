package edu.marco.garcia.actividades.actividad3.ui;

import java.util.ArrayList;
import java.util.Scanner;

import static edu.marco.garcia.actividades.actividad3.models.Colors.AMARILLO;
import static edu.marco.garcia.actividades.actividad3.models.Colors.AZUL;
import static edu.marco.garcia.actividades.actividad3.models.Colors.BLANCO;
import static edu.marco.garcia.actividades.actividad3.models.Colors.MAGENTA;
import static edu.marco.garcia.actividades.actividad3.models.Colors.RESET;
import static edu.marco.garcia.actividades.actividad3.models.Colors.ROJO;
import static edu.marco.garcia.actividades.actividad3.models.Colors.VERDE;
import edu.marco.garcia.actividades.actividad3.models.Products;

public class CLI3 {
    private static ArrayList<Products> stock = new ArrayList<>();

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(BLANCO + "\n╔══════════════════════════════════╗");
            System.out.println("║              MENÚ                ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║ 1. Consultar precio del producto ║");
            System.out.println("║ 2. Agregar producto              ║");
            System.out.println("║ 3. Mostrar Stock                 ║");
            System.out.println("║ 4. Comparar productos            ║");
            System.out.println("║ 5. Salir                         ║");
            System.out.println("╚══════════════════════════════════╝" + RESET);

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> consultarPrecio(sc);
                case 2 -> agregarProducto(sc);
                case 3 -> mostrarStock();
                case 4 -> compararProductos(sc);
                case 5 -> System.out.println(AZUL + "Cerrando programa..."+ RESET);
                default -> System.out.println(ROJO + "Opción inválida, intente de nuevo."+ RESET);
            }
        } while (opcion != 5);

        sc.close();
    }

    // Consultar el precio de un producto
    private static void consultarPrecio(Scanner sc) {
        if (stock.isEmpty()) {
            System.out.println(AMARILLO + "No hay productos registrados en el stock"+ RESET);
            return;
        }
        System.out.println(MAGENTA + "\nIngrese el código del producto que desea consultar: " + RESET);
        String codigo = sc.nextLine();
        Products productoEncontrado = null;

        for (Products producto : stock) {
            if (producto.getCodigo().equals(codigo)) {
                productoEncontrado = producto;
                break;
            }
        }

        if (productoEncontrado != null) {
            System.out.println("Ingrese el porcentaje de utilidad: ");
            try {
                Double utilidad = Double.valueOf(sc.nextLine());
                System.out.println("Precio de venta: " + productoEncontrado.calcularPrecio(utilidad));
            } catch (Exception e) {
                System.out.println(ROJO + "Error al ingresar el porcentaje de utilidad"+ RESET);
            }
        } else {
            System.out.println(AMARILLO + "No se reconoce el producto" + RESET);
        }
    }

    // Agregar un producto al stock
    private static void agregarProducto(Scanner sc) {
        Products nuevoProducto = new Products();
        System.out.println("\nIngrese los detalles del producto:");
        System.out.print("Código: ");
        nuevoProducto.setCodigo(sc.nextLine());
        System.out.print("Tipo: ");
        nuevoProducto.setTipo(sc.nextLine());
        System.out.print("Costo: ");
        
        try {
            nuevoProducto.setCosto(Double.valueOf(sc.nextLine()));
        } catch (Exception e) {
            System.out.println(ROJO + "Error al ingresar el impuesto"+ RESET);
            return;
        }
        stock.add(nuevoProducto);
        System.out.println(VERDE + "\nProducto agregado al stock" + RESET);
    }

    // Mostrar el stock de la tienda
    private static void mostrarStock() {
        if (stock.isEmpty()) {
            System.out.println(AMARILLO + "No hay productos en el stock"+ RESET);
        } else {
            System.out.println("\nStock de la tienda: ");
            for (Products producto : stock) {
                producto.muestraProducto();
            }
        }
    }

    // Comparar dos productos almacenados
    private static void compararProductos(Scanner sc) {
        if (stock.size() < 2) {
            System.out.println(AMARILLO + "No hay suficientes productos para comparar" + RESET);
            return;
        }

        System.out.println("\nIngrese el código del primer producto:");
        String codigo1 = sc.nextLine();
        Products producto1 = null;

        for (Products producto : stock) {
            if (producto.getCodigo().equals(codigo1)) {
                producto1 = producto;
                break;
            }
        }

        if (producto1 == null) {
            System.out.println(AMARILLO + "Producto no encontrado"+ RESET);
            return;
        }

        System.out.println("\nIngrese el código del segundo producto:");
        String codigo2 = sc.nextLine();
        Products producto2 = null;

        for (Products producto : stock) {
            if (producto.getCodigo().equals(codigo2)) {
                producto2 = producto;
                break;
            }
        }

        if (producto2 == null) {
            System.out.println(AMARILLO + "Producto no encontrado" + RESET);
            return;
        }

        System.out.println("Ingrese el porcentaje de utilidad:");
        try {
            Double utilidad = Double.valueOf(sc.nextLine());
            String resultado = Products.compararProductos(producto1, producto2, utilidad);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println(ROJO + "Error al ingresar el porcentaje de utilidad "+ RESET);
        }
    }
}


