/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Consola {
    
    Scanner miEntrada=new Scanner(System.in);
    
    int menuPrincipal(){
        
        System.out.println("Seleccione una opción:" );
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion;
        do{
            System.out.println("Por favor ingrese una opción:");
            opcion=miEntrada.nextInt();
            
        }while(opcion<1 || opcion >4);
        
        return opcion;
    }

    float ingresarDato() {
        System.out.println("Por favor ingrese el número:");
        return miEntrada.nextFloat();
    }
    
    void imprimir(float dato){
        
        System.out.println("El resultado es:"+dato);
    }
    
}
