
package Calculadora;


public class CalculadoraController {
    
    private CalculadoraModel model;
    private calculadoraView view;
    
    public CalculadoraController(CalculadoraModel model, calculadoraView view){
        this.model= model;
        this.view = view;
        
    }
    //Metod para gestionar el flujo de la aplicacion
    public void ejecutarCalculadora(){
        boolean continuar = true;
        
        
        while(continuar){
            //obtener numeros y operacion
            double[] numeros = view.obtenerNumeros();
            String operacion = view.optenerOperacion();
            
            //realizar el calculo
            
            double resultado = model.realizarOperacion(numeros[0], numeros[1] , operacion);
            
            // verificar si el resultado es valido
            if(!Double.isNaN(resultado)){
            view.mostrarResultado(resultado);
        }
            //preguntar si desea continuar
            continuar = view.continuarCalculado();
        }
    }
}
