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
public class Calculadora {
    private float numero1;
    private float numero2;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    
    
    
    float sumar(){
        
        return numero1+numero2;
    }
    
    float restar(){
        
        return numero1-numero2;
    }
    
    float multiplicar(){
        
        return numero1*numero2;
    }
    
    float dividir(){
        
        float resultado;
        try{
            resultado= numero1/numero2;
        }catch(Exception e){
            
            resultado=0;
        }
        
        return resultado;
        
    }
    
}
