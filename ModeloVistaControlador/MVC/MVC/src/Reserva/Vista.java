
package Reserva;


import java.util.Scanner;

public class Vista {
    
    private Scanner scanner = new Scanner(System.in);
    
    //Metodo para mostrar el menu y opciones
    public void mostrarMenu(){
        System.out.println("Bienvenido al sistema de reservas..");
        System.out.println("1. Reservar asiento ");
        System.out.println("2. Ver asientos reservados ");
        System.out.println("3. Salir ");
    }
        //Metodo para pedir numero de asiento
        public int obtenerNumeroAsiento(){
            System.out.println("Ingrese numero de aseinto a reservar ( 0- para Salir):");
            return scanner.nextInt();
        }
     
        // Metodo para mostrar un mensaje de exito o error dela reserva
        public void mostrarResultadoReserva(boolean exito){
            if(exito){
                System.out.println("Reserva realizada con exito");
             
            }else{
                System.out.println("No se puede realiar la reserva o el asiento esta ocupado");
            }
        }
        //Metodo para mostrar mostrar el numero de asientos ocupados
        public void mostrarAsientosOcupados(int ocupados, int capacidad){
            System.out.println("Asientos ocupados: "+ocupados+" / "+capacidad);
        }
        
        //Metodo para preguntar si el usuario quiere seguir reservado
        public boolean continuarReservado(){
            System.out.println("Desea realizar otra reserva (S/N): ");
            String respuesta = scanner.next();
            return respuesta.equalsIgnoreCase("S");
        }

        
    }