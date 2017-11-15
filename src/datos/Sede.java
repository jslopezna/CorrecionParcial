/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Sede {
    
    protected String nombre; 
    protected String direccion; 
    protected int telefono; 
    protected double areaContruida; 

    public Sede(String nombre, String direccion, int telefono, double areaContruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaContruida = areaContruida;
    }
    
    public abstract String darInfo(); 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaContruida() {
        return areaContruida;
    }

    public void setAreaContruida(double areaContruida) {
        this.areaContruida = areaContruida;
    }

    void addEdu(EducacionContinuada edu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
