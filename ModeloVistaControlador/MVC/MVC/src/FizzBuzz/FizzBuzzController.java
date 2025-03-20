
package FizzBuzz;


public class FizzBuzzController {

    private FizzBuzzModel model;
    private FizzBuzzView view;
    
    //constructor que recibe el modelo y la vista
    public FizzBuzzController(FizzBuzzModel model, FizzBuzzView view){
        this.model = model;
        this.view = view;
    }
    //metodo que recorre los numeros del 1 al 100 y muestra el resultado

    public void runFizzBuzz(){
        for (int i = 1; i<= 100; i++){
            String result = model.getFizzBuzz(i);
            view.printFizzBuzzResult(result);
        }
    }
}
