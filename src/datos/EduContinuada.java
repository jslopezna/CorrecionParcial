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
public class EduContinuada extends Sede {

    private String programaP;

    public EduContinuada( String nombre, String direccion, int telefono, double areaContruida,String programaP) {
        super(nombre, direccion, telefono, areaContruida);
        this.programaP = programaP;
    }

    @Override
    public String darInfo() {
        String info = nombre + direccion + telefono + areaContruida;
        return info;
    }

}
