
package Calculadora;


public class Main {

        public static void main(String[] args) {
        
            System.out.println(" Bienvenido a tu calculadora ");
            
            //inicializar el modelo vista controlador
            CalculadoraModel model = new CalculadoraModel();
            calculadoraView view = new calculadoraView();
            CalculadoraController controller = new CalculadoraController(model, view);
            
            //ejercutar aplicacion
            controller.ejecutarCalculadora();
    }
}
