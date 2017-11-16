/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Tecnologico extends Sede {

    private int noEstudiantes;
    private ArrayList<ProgFormacion> programas;

    public Tecnologico(int noEstudiantes, String nombre, String direccion, int telefono, double areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
        this.noEstudiantes = noEstudiantes;
        this.programas = new ArrayList<>();
    }

    public void addPrograma(String nombre, String descripcion){
        ProgFormacion programa= new ProgFormacion(nombre, descripcion); 
        programas.add(programa); 
    }
    @Override
    public String darInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
