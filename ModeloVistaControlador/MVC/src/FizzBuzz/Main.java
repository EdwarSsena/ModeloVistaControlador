
package FizzBuzz;


public class Main {
    public static void main(String[] args){
        //Crear la instancia del modelo y la vista
    
        FizzBuzzModel model = new FizzBuzzModel();
        FizzBuzzView view = new FizzBuzzView();
        
        //Crear el controlador y pasarle el modelo y la vista
        FizzBuzzController controller = new FizzBuzzController(model, view);
        
        //Ejercutar el juego FizzBuzz
        controller.runFizzBuzz();
    }
    
}
