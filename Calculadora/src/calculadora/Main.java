/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora miCalculador=new Calculadora();
        Consola miConsola=new Consola();
        int respuesta=miConsola.menuPrincipal();
        float resultado;
        
        
        miCalculador.setNumero1(miConsola.ingresarDato());
        miCalculador.setNumero2(miConsola.ingresarDato()); 
        
        switch(respuesta){
            
            case 1:
                miConsola.imprimir(miCalculador.sumar());
                break;
                
            case 2:
                miConsola.imprimir(miCalculador.restar());                
                break;
                
            case 3:
                miConsola.imprimir(miCalculador.multiplicar());                
                break;
                
            
        }
    }
    
}
