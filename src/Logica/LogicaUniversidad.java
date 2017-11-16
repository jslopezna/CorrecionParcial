/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import datos.EduContinuada;
import datos.Profesional;
import datos.Sede;
import datos.Tecnologico;
import datos.Universidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class LogicaUniversidad {

    private Universidad universidad;

    public void cargar(String ruta) throws FileNotFoundException {

        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if (lectura.exists()) {
            try {
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo = null, nombre = null, direccion = null, nombreProg = null, descripcion = null, tecnologo = null, EduContinua = null;
                int tel = 0;
                int programas = 0;
                double areaConstruida = 0;
                int noEstu = 0;
                while (flujoEntrada.hasNext()) {
                    tipo = flujoEntrada.next().trim();
                    if (tipo.equals("P")) {
                        nombre = flujoEntrada.next().trim();
                        direccion = flujoEntrada.next().trim();
                        tel = flujoEntrada.nextInt();
                        areaConstruida = flujoEntrada.nextDouble();
                        programas = flujoEntrada.nextInt();
                        nombreProg = flujoEntrada.next().trim();
                        descripcion = flujoEntrada.next().trim();
                        tecnologo = flujoEntrada.next().trim();
                        EduContinua = flujoEntrada.next().trim();

                        /*Profesional profesional = new Profesional(nombre, direccion, tel, areaConstruida, programas);
                        universidad.addProfesional(profesional);
                        profesional.addPrograma(nombreProg, descripcion);
                        profesional.addTecno(tecnologo);
                        profesional.addEdu(EduContinua);*/

                    } else if (tipo.equals("T")) {
                        nombre = flujoEntrada.next().trim();
                        direccion = flujoEntrada.next().trim();
                        tel = flujoEntrada.nextInt();
                        areaConstruida = flujoEntrada.nextDouble();
                        noEstu = flujoEntrada.nextInt();
                        nombreProg = flujoEntrada.next().trim();
                        descripcion = flujoEntrada.next().trim();

                        Tecnologico tecnologico = new Tecnologico(noEstu, nombre, direccion, tel, areaConstruida);
                        tecnologico.addPrograma(nombreProg, descripcion);
                        universidad.addTecnologo(tecnologico);

                    } else if (tipo.equals("E")) {
                        nombre = flujoEntrada.next().trim();
                        direccion = flujoEntrada.next().trim();
                        tel = flujoEntrada.nextInt();
                        areaConstruida = flujoEntrada.nextDouble();
                        nombreProg = flujoEntrada.next().trim();

                        EduContinuada continua = new EduContinuada(nombre, direccion, tel, areaConstruida, nombreProg);

                    }

                }
                //Solo para prueba

            } catch (FileNotFoundException ex) {
                System.out.println("No se encontro archivo");
            }

        }

    }

    public String listarSedes() {
        String listaSedes = "";
        for (Sede sedes : this.universidad.getSedes()) {
            listaSedes += sedes.darInfo();
        }
        return listaSedes;
    }
}
