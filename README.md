# LlanquihueTour - Sistema de Gestión de Personas

## Descripción

Sistema orientado a objetos desarrollado para la agencia de turismo **Llanquihue Tour**, ubicada en la comuna de Llanquihue, Región de Los Lagos. El proyecto representa las personas vinculadas a la organización (clientes y empleados) aplicando principios de encapsulamiento, composición y herencia.

## Estructura del proyecto

```
LlanquihueTour/
└── src/
    ├── model/
    │   ├── Direccion.java     → Clase de composición con datos de dirección
    │   ├── Persona.java       → Clase base con atributos comunes de una persona
    │   └── Empleado.java      → Subclase que hereda de Persona, agrega cargo y salario
    └── app/
        └── Main.java          → Clase principal que instancia y muestra los objetos
```

## Relaciones entre clases

- **Composición:** `Persona` contiene un objeto `Direccion` como atributo.
- **Herencia:** `Empleado` extiende `Persona`, reutilizando sus atributos y métodos.

## Cómo compilar y ejecutar

### Desde IntelliJ IDEA

1. Abrir IntelliJ IDEA y seleccionar **Open** → carpeta `LlanquihueTour`.
2. Verificar que la carpeta `src` esté marcada como **Sources Root** (clic derecho → Mark Directory as → Sources Root).
3. Abrir `src/app/Main.java` y presionar el botón **Run** (▶) o usar `Shift + F10`.

### Desde la terminal

```bash
# Compilar
javac -d out src/model/Direccion.java src/model/Persona.java src/model/Empleado.java src/app/Main.java

# Ejecutar
java -cp out app.Main
```

## Salida esperada por consola

```
=== Cliente ===
Nombre: María Fernández | RUT: 12.345.678-9 | Teléfono: +56 9 8765 4321 | Dirección: Av. Frutillar 320, Llanquihue

=== Empleado - Guía ===
Nombre: Carlos Soto | RUT: 15.678.901-2 | Teléfono: +56 9 1234 5678 | Dirección: Calle Pérez Rosales 145, Puerto Montt | Cargo: Guía Turístico | Salario: $850000.0

=== Empleado - Coordinadora ===
Nombre: Ana Ramírez | RUT: 17.890.123-4 | Teléfono: +56 9 9876 5432 | Dirección: Los Aromos 89, Llanquihue | Cargo: Coordinadora de Tours | Salario: $1200000.0
```

## Autor

- **Nombre:** [Tu nombre aquí]
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Institución:** Duoc UC
