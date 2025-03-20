
package Calculadora;


public class CalculadoraModel {

    //metodo para calcular la operacion
    public double realizarOperacion(double num1, double num2, String Operacion){
        double resultado = 0.0;
        
        switch(Operacion){
            case "suma":
                resultado = num1 + num2;
                break;
                
            case "resta":
                resultado = num1 - num2;
                break;
                
            case "multiplicacion":
                resultado = num1 * num2;
                break;
                
            case "division":
                if(num2 == 0){
                    System.out.println("No se puede dividir por cero ");
                    return Double.NaN;
                }else{
                    resultado = num1 / num2;
                    
                }
                break;
                
                default:
                    System.out.println("Operacion no validad");
                    return Double.NaN;
                    
        }
        return resultado;
    }
    
}
