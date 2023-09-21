/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import entidades.Libro;

/**
 *
 * @author rebek
 * 
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] editoriales = {"uno", "dos", "tres"};
        Libro l1 = new Libro();
        l1 = l1.nuevoLibro("LOTR", 560, editoriales);
        l1.buscarEditorial(l1, "cuatro");
    }
    
}
