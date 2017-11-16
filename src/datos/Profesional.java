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
    private ArrayList<ProgFormacion> programas;
    private ArrayList<String> EduContinua;
    private ArrayList<String> tecnologico;

    public Profesional(String nombre, String direccion, int telefono, double areaContruida, int noProgramas) {
        super(nombre, direccion, telefono, areaContruida);
        this.noProgramas = noProgramas;
        this.EduContinua = EduContinua;
    }

    public String darInfo() {
        String programa = null;
        String continua = null;
        String tecnologicos = null;
        for (int i = 0; i <= programas.size(); i++) {
            programa += "/n" + programas.get(i).getNombre();
            tecnologicos += "/n" + tecnologico.get(i);
            continua += "/n" + EduContinua.get(i);

        }
        String info = nombre + direccion + telefono + areaContruida + programa + tecnologico+ continua;
        return info;
    }

    public void addPrograma(String name, String descripcion) {
        ProgFormacion programa = new ProgFormacion(name, descripcion);
        programas.add(programa);
    }

    public void addTecno(String nombre) {
        tecnologico.add(nombre);

    }

    public void addEdu(String nombre) {
        EduContinua.add(nombre);

    }

}
