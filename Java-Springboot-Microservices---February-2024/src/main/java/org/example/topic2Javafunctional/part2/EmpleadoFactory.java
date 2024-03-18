package org.example.topic2Javafunctional.part2;

import java.util.Arrays;
import java.util.List;

public class EmpleadoFactory {
    public List<Empleado> getAllEmployee() {
        Proyecto Delta = new Proyecto("Modelo Delta", "Iniciar sesión", "Robert Downey Jr");
        Proyecto Beta = new Proyecto("Mejora Beta", "Autenticación", "Chris");
        Proyecto TwoFactorAuth = new Proyecto("Autenticación de dos factores", "Autenticación", "MSD");
        Proyecto CommonUI = new Proyecto("UI común", "UI", "Robert Downey Jr");
        Proyecto Pegasus = new Proyecto("Modelo Pegasus", "Datos", "Vikram");
        Proyecto CustomerOnboarding = new Proyecto("Incorporación de clientes", "Anuncios", "Vedha");
        Proyecto Verificacion = new Proyecto("Verificación de Fuente", "Datos", "Pablo");
        Proyecto RemoveUsers = new Proyecto("Eliminar usuario no válido", "Proxy", "Jeetu");
        Proyecto SiteReliability = new Proyecto("Confiabilidad del sitio", "Administrador", "Zaheer Khan");
        Proyecto DataTransition = new Proyecto("Transición de datos", "Datos", "Atif Aslam");
        Proyecto TwoPhaseDeployment = new Proyecto("Implementación en dos fases", "Despliegue", "Shaktiman");

        return Arrays.asList(
                new Empleado("2020Emp0234", "Bhaskar", "Sharan", 900000, 1, Arrays.asList(Delta, Beta)),
                new Empleado("2012Emp1923", "Dev", "Sharma", 3500000, 3, Arrays.asList(Pegasus, CustomerOnboarding, Beta, SiteReliability)),
                new Empleado("2017Emp0721", "Priti", "Kabir", 1800000, 3, Arrays.asList(TwoFactorAuth, Beta, CommonUI)),
                new Empleado("2017Emp00031", "Chris", "Martin", 2200000, 2, Arrays.asList(Delta, TwoFactorAuth)),
                new Empleado("2013Emp0872", "Sanjay", "Singhania", 2200000, 3, Arrays.asList(Pegasus, Delta, RemoveUsers, DataTransition)),
                new Empleado("2022Emp0087", "Babu", "Rao", 900000, 1, Arrays.asList(TwoFactorAuth)),
                new Empleado("2019Emp0050", "Dev", "Anand", 1300000, 1, Arrays.asList(RemoveUsers, CommonUI)),
                new Empleado("2023Emp0934", "Shruti", "Sen", 1100000, 1, Arrays.asList(Pegasus)),
                new Empleado("2023Emp1033", "Akshay", "Kumar", 1200000, 0, Arrays.asList(Delta)),
                new Empleado("2023Emp1033", "Akshay", "Kumar", 2600000, 2, Arrays.asList(Verificacion, RemoveUsers, TwoPhaseDeployment))
        );
    }
}
