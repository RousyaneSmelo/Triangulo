/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Triangulo {
    
    public String classificar(double a, double b, double c) {
        
        if ((a == b ) && (b == c)) {
            
            return "Triangulo Equilatero";
    }
    
    if((a == b && c != b) || (a == c && a != b) || (b == c && c != a)) { 
                if (a+b > c && b+c > a && a+c > b) {
                    return "Triangulo Isósceles";
                }
                else {
                    return "Não é um triangulo!";
                }
    }
    
    if (a != b && c != b) {
                if(a+b > c && b+c > a && a+c > b) {
                    return "Triangulo Escaleno";
                }
                else {
                    return "Não é um triangulo!";
            }
    }
        
    return "Tente digite outros numeros";
      
    }
}
        
    

