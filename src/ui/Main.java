/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Logica.LogicaUniversidad;
import java.io.FileNotFoundException;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        LogicaUniversidad logica= new LogicaUniversidad(); 
        logica.cargar("Formato"); 
        String sedes= logica.listarSedes(); 
        System.out.println(sedes);
    }
    
}
