/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n1,c1;
        int d1,e1;
        
        System.out.print("Ingrese el nombre del Hospital: \n");
        n1 = sc.nextLine();
        System.out.print("Ingrese el nombre de la Ciudad: \n");
        c1 = sc.nextLine();
        System.out.print("Ingrese el número de Doctores: \n");
        d1 = sc.nextInt();
        System.out.print("Ingrese el número de Enfermeros: \n");
        e1 = sc.nextInt();
        
        Hospital h2 = new Hospital(n1,c1,d1,e1);
        System.out.printf("Nombre: %s\n"
            +"Ciudad: %s\n"
            +"Número de doctores: %d\n"
            +"Número de Enfermeros: %d\n"
            ,h2.obtenerNombre(),h2.obtenerCiudad(),h2.obtenerNumeroDoctores()
            ,h2.obtenerNumeroEnfermeros());
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        
    }
}
