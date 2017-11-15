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
public class EducacionContinuada extends Sede {

    public EducacionContinuada(String nombre, String direccion, int telefono, double areaContruida) {
        super(nombre, direccion, telefono, areaContruida);
    }

    

    @Override
    public String darInfo() {
        String info = nombre + direccion + telefono + areaContruida;
        return info;
    }

}
