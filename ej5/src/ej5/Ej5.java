/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = (int) (Math.random() * 10 + 1);
        int intentos = 0;
        boolean win= false;
        int input;
        
        while(!win){
                try{
                    System.out.println("Ingresa un numero");
                input = read.nextInt();
                if(input == num){
                    win = true;
                }
        }catch(NumberFormatException e){
            System.out.println("Solo se aceptan numeros enteros");
        }catch(InputMismatchException e){
            System.out.println("No se admiten letras");
        } finally {
            intentos++;
        }
        }
        System.out.println("La cantidad de intentos fue: "+ intentos);
        System.out.println("El numero secreto es "+num);
    }
    
}
