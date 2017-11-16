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
public class Universidad {

    private ArrayList<Sede> sedes;

    public Universidad(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

    public void addProfesional(Profesional profesional) {

        sedes.add(profesional);

    }

    public void addTecnologo(Tecnologico tecnologico) {
        sedes.add(tecnologico);
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

}
