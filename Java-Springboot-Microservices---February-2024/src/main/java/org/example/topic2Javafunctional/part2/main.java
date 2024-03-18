package org.example.topic2Javafunctional.part2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class main {
    static List<Empleado> listaEmpleados = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        EmpleadoFactory factory = new EmpleadoFactory();
        listaEmpleados = factory.getAllEmployee();

        List<String> proyectosDistintos = listaEmpleados.stream()
                .flatMap(empleado -> empleado.getProyectos().stream())
                .map(Proyecto::getNombre)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Proyectos distintos en orden no ascendente: " + proyectosDistintos);

        Optional<Empleado> empleadoConNombreA = listaEmpleados.stream()
                .filter(empleado -> empleado.getNombre().startsWith("A"))
                .findFirst();

        empleadoConNombreA.ifPresent(empleado -> System.out.println("Empleado con nombre que comienza con 'A': " + empleado.getNombre() + " " + empleado.getApellido()));

        List<Empleado> empleadosUnidosEn2023 = listaEmpleados.stream()
                .filter(empleado -> empleado.getId().startsWith("2023"))
                .collect(Collectors.toList());

        System.out.println("Empleados que se unieron en el año 2023: " + empleadosUnidosEn2023);

        List<Empleado> empleadosOrdenados = listaEmpleados.stream()
                .sorted(Comparator.comparing(Empleado::getNombre).thenComparing(Empleado::getSalario))
                .collect(Collectors.toList());

        System.out.println("Empleados ordenados por nombre y salario: " + empleadosOrdenados);

        int n = 3;
        List<String> nombresEnesimoSalario = listaEmpleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getSalario).reversed())
                .limit(n)
                .map(Empleado::getNombre)
                .collect(Collectors.toList());

        System.out.println("Nombres del " + n + "º salario más alto: " + nombresEnesimoSalario);

        OptionalInt salarioMinimo = listaEmpleados.stream()
                .mapToInt(Empleado::getSalario)
                .min();

        salarioMinimo.ifPresent(min -> System.out.println("Salario mínimo: " + min));

        List<Empleado> empleadosConSalarioMinimo = listaEmpleados.stream()
                .filter(empleado -> empleado.getSalario() == salarioMinimo.getAsInt())
                .collect(Collectors.toList());

        System.out.println("Empleados con salario mínimo: " + empleadosConSalarioMinimo);

        List<Empleado> empleadosMasDeDosProyectos = listaEmpleados.stream()
                .filter(empleado -> empleado.getProyectos().size() > 2)
                .collect(Collectors.toList());

        System.out.println("Empleados que trabajan en más de 2 proyectos: " + empleadosMasDeDosProyectos);

        int totalLaptops = listaEmpleados.stream()
                .mapToInt(Empleado::getTotalLaptopsAssigned)
                .sum();

        System.out.println("Total de laptops asignadas a los empleados: " + totalLaptops);

        long countProyectosRobertDowneyJr = listaEmpleados.stream()
                .flatMap(empleado -> empleado.getProyectos().stream())
                .filter(proyecto -> proyecto.getProjectManager().equals("Robert Downey Jr"))
                .count();

        System.out.println("Cantidad de proyectos con Robert Downey Jr como primer ministro: " + countProyectosRobertDowneyJr);

        List<Proyecto> proyectosRobertDowneyJr = listaEmpleados.stream()
                .flatMap(empleado -> empleado.getProyectos().stream())
                .filter(proyecto -> proyecto.getProjectManager().equals("Robert Downey Jr"))
                .collect(Collectors.toList());

        System.out.println("Proyectos con Robert Downey Jr como primer ministro: " + proyectosRobertDowneyJr);

        List<Empleado> empleadosTrabajandoConRobertDowneyJr = listaEmpleados.stream()
                .filter(empleado -> empleado.getProyectos().stream().anyMatch(proyecto -> proyecto.getProjectManager().equals("Robert Downey Jr")))
                .collect(Collectors.toList());

        System.out.println("Empleados que trabajan con Robert Downey Jr: " + empleadosTrabajandoConRobertDowneyJr);
    }
}
