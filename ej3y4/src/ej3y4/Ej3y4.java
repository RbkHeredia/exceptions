/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * 3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
* 
* 4.Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
public class Ej3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        String num1 = read.nextLine();
        System.out.println("Ingresa otro numero");
        String num2= read.nextLine();
        
        try{
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            System.out.println(n1/n2);
        }catch(NumberFormatException e){
            System.out.println("Solo se aceptan numeros enteros");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }catch(InputMismatchException e){
            System.out.println("No se admiten letras");
        }
    }   
}
