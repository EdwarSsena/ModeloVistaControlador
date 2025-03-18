
package FizzBuzz;

// metodo que procesa el numero y devuelve el valor

public class FizzBuzzModel {
    
    public String getFizzBuzz(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else if (number % 3 == 0){
            return "Fizz";
        }else if (number % 5 == 0){
        return "Buzz";
        }else {
               return Integer.toString(number); //si no es divisible por 3 y 5 devuelve el numero
        }
    }
    
}
