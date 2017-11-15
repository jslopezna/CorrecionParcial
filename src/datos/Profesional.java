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
public class Profesional extends Sede {

    private int noProgramas;
    private ArrayList<EducacionContinuada> EduContinua;
    private ArrayList<Tecnologico> tecnologico;

    public Profesional( String nombre, String direccion, int telefono, double areaContruida,int  noProgramas) {
        super(nombre, direccion, telefono, areaContruida);
        this.noProgramas = noProgramas;
        this.EduContinua = EduContinua;
    }

    public String darInfo() {
        String info = nombre + direccion + telefono + areaContruida;
        return info;
    }

    public void addEdu(String nombre, String direccion, int telefono, double areaContruida) {
        
    }
       
}
