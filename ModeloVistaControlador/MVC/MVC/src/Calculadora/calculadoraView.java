
package Calculadora;


import java.util.Scanner;

public class calculadoraView {
    
    private Scanner scanner = new Scanner(System.in);
    
    // metodo para pedir al usuario los numeros y la operacion a realizar
    public double [] obtenerNumeros(){
        System.out.println("Ingrese el primer nuemro:  ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Introduce el segundo numero.  ");
        double num2 = scanner.nextDouble();
        
        return new double[] {num1,num2};
    }
    public String optenerOperacion(){
        System.out.println("Introduce la operaion a realizar: (suma, resta, multiplicacioin o division)");
        return scanner.next().toLowerCase();
    }
    //metodo para mostrar el resultado
    public void mostrarResultado(double resultado){
        System.out.println("Resultado. "+resultado);
        
    }
    //Metodo para preguntar si desea continuar
    public boolean continuarCalculado(){
        System.out.println("Desea seguir calculado (si/no): ");
        String respuesta = scanner.next().trim().toLowerCase();
        return respuesta.equals ("si");
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
}
