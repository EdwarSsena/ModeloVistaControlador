
package Reserva;


public class main {
    
    public static void main(String[] args) {
        //Sala de diez aseintos
        Sala sala = new Sala(10);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sala, vista);
        
        //Reservas
        controlador.gestionarReservas();
    }
    
}