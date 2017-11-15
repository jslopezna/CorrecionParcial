/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaUniversidad;

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
public class Logica {

    private Universidad universidad;

    public void cargar(String ruta) {

        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if (lectura.exists()) {
            try {
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo = null, nombre = null, direccion = null;
                int tel = 0;
                
                int programas=0; 
                double areaConstruida = 0;
                int noEstu= 0; 
                while (flujoEntrada.hasNext()) {
                    tipo = flujoEntrada.next().trim();
                    if (tipo.equals("P")) {
                        nombre = flujoEntrada.next().trim();
                        direccion = flujoEntrada.next().trim();
                        tel = flujoEntrada.nextInt();
                        areaConstruida = flujoEntrada.nextDouble();
                        programas= flujoEntrada.nextInt();

                       
                        universidad.addSedeProfesional(nombre, direccion, tel, areaConstruida, programas);

                    } else if (tipo.equals("T")) {
                        nombre = flujoEntrada.next().trim();
                        direccion= flujoEntrada.next().trim();
                        tel= flujoEntrada.nextInt(); 
                        areaConstruida= flujoEntrada.nextDouble(); 
                        noEstu= flujoEntrada.nextInt(); 
                        universidad.addTecnologo()

                    } else if (tipo.equals("E")) {

                    }
                    //Solo para prueba

                }

            } catch (FileNotFoundException ex) {
                
                   
            }
        }
    }
