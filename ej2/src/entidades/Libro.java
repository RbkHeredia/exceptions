/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rebek
 */
public class Libro {
    private String nombre;
    private int cantPag;
    private String[] editoriales;

    public Libro() {
    }

    public Libro(String nombre, int cantPag, String[] editoriales) {
        this.nombre = nombre;
        this.cantPag = cantPag;
        this.editoriales = editoriales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public String[] getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(String[] editoriales) {
        this.editoriales = editoriales;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", cantPag=" + cantPag + ", editoriales=" + editoriales + '}';
    }
    
    public Libro nuevoLibro(String nombre, int cantPag, String[] editoriales){
        Libro l1 = new Libro();
        l1.setNombre(nombre);
        l1.setCantPag(cantPag);
        l1.setEditoriales(editoriales);
        return l1;
    }
    
    public void buscarEditorial(Libro l1, String editorial){
        try{
            for (int i = 0; i < 5; i++) {
                if(l1.getEditoriales()[i].equals(editorial)){
                    System.out.println("El libro se encuentra en stock");
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: No existe el libro");
        }
    }
}
