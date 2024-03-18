package org.example.topic2Javafunctional.part2;

import java.util.List;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private int salario;
    private int totalLaptopsAssigned;
    private List<Proyecto> proyectos;

    public Empleado(String id, String nombre, String apellido, int salario, int totalLaptopsAssigned,
                    List<Proyecto> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.totalLaptopsAssigned = totalLaptopsAssigned;
        this.proyectos = proyectos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getTotalLaptopsAssigned() {
        return totalLaptopsAssigned;
    }

    public void setTotalLaptopsAssigned(int totalLaptopsAssigned) {
        this.totalLaptopsAssigned = totalLaptopsAssigned;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", proyectos="
                + proyectos + "]";
    }
}
