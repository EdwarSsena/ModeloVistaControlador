
package Reserva;


public class Controlador {
    private Sala sala;
    private Vista vista;
    
    //Constructor del controlador
    public Controlador (Sala sala, Vista vista){
        this.sala = sala;
        this.vista = vista;
    }
    //Metodo para registrar la logica de reserva
    public void gestionarReservas(){
        while(true){
            vista.mostrarMenu();
            int opcion = new Scanner(System.in).nextInt();
            switch(opcion){
                case 1:
                    if(sala.hayAsientosDisponibles()){
                        int numeroAsiento = vista.obtenerNumeroAsiento();
                        if(numeroAsiento == 0){
                            System.out.println("Saliendo del sistema.......");
                            return;
                        }
                        boolean exito = sala.reservarAsiento(numeroAsiento);
                        vista.mostrarResultadoReserva(exito);
                    }else{
                        System.out.println("Lo siento no hay asientos disponibles ");
                    }
                    break;
                case 2:
                    vista.mostrarAsientosOcupados(sala.getAsientosOcupados, sala.getCapacidad());
                    break;
                    
                case 3:
                    System.out.println("Gracias por usar el sistema ");
                    return;
                default:
                    System.out.println("Opcion no valida ");
                    break;
            }
            if(!vista.continuarReservando()){
                break;
            }
        }
    }//ola
    
    
}