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

   public void addSedeProfesional(String nombre, String direccion, int tel, double area, int programas) {
        Sede profesional= new Profesional(nombre, direccion, tel, area, programas); 
        //profesional.addEdu(edu); 
        sedes.add(profesional); 

    }
   
   public void addtecnologo(String nombre, String direccion, int tel, double area, int programas){
       Sede tecnologo= new Tecnologico(programas,nombre, direccion, tel,area); 
   }

}
