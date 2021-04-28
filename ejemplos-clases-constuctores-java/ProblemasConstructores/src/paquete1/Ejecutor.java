/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Hospital h = new Hospital();
        System.out.printf("Nombre: %s\n"
            +"Ciudad: %s\n"
            +"Número de doctores: %d\n"
            +"Número de Enfermeros: %d\n"
            ,h.obtenerNombre(),h.obtenerCiudad(),h.obtenerNumeroDoctores()
            ,h.obtenerNumeroEnfermeros());
        /*Crear un objeto y presentar los datos*/
        
    }
}
