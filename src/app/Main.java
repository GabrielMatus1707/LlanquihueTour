package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        // Instancia 1: Persona general (cliente)
        Direccion dir1 = new Direccion("Av. Frutillar", "320", "Llanquihue");
        Persona cliente = new Persona("María Fernández", "12.345.678-9", "+56 9 8765 4321", dir1);
        System.out.println("=== Cliente ===");
        System.out.println(cliente);
        System.out.println();

        // Instancia 2: Empleado (guía turístico)
        Direccion dir2 = new Direccion("Calle Pérez Rosales", "145", "Puerto Montt");
        Empleado guia = new Empleado("Carlos Soto", "15.678.901-2", "+56 9 1234 5678", dir2, "Guía Turístico", 850000);
        System.out.println("=== Empleado - Guía ===");
        System.out.println(guia);
        System.out.println();

        // Instancia 3: Empleado (coordinador de tours)
        Direccion dir3 = new Direccion("Los Aromos", "89", "Llanquihue");
        Empleado coordinador = new Empleado("Ana Ramírez", "17.890.123-4", "+56 9 9876 5432", dir3, "Coordinadora de Tours", 1200000);
        System.out.println("=== Empleado - Coordinadora ===");
        System.out.println(coordinador);
    }
}
