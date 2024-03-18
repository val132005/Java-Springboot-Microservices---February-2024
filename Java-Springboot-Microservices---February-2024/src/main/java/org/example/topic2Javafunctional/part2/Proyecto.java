package org.example.topic2Javafunctional.part2;

public class Proyecto {
    private String nombre;
    private String area;
    private String projectManager;

    public Proyecto(String nombre, String area, String projectManager) {
        this.nombre = nombre;
        this.area = area;
        this.projectManager = projectManager;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", area=" + area + ", projectManager=" + projectManager + "]";
    }
}
