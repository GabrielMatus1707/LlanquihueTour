package model;

public class Empleado extends Persona {

    private String cargo;
    private double salario;

    public Empleado(String nombre, String rut, String telefono, Direccion direccion, String cargo, double salario) {
        super(nombre, rut, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return super.toString() +
               " | Cargo: " + cargo +
               " | Salario: $" + salario;
    }
}
