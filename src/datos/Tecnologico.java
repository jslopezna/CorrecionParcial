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
public class Tecnologico extends Sede {
    private int noEstudiantes;

    public Tecnologico(int noEstudiantes, String nombre, String direccion, int telefono, double areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
        this.noEstudiantes = noEstudiantes;
    }

    

    @Override
    public String darInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
