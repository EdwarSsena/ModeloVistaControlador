
package Reserva;

public class Sala {

    private boolean[] asientos;
    private int capacidad;
    
    //Constructor de la sala
    public Sala(int capacidad){
        this.capacidad = capacidad;
        this.asientos = new boolean[capacidad];//false significa que el asiento esta libre
    }
    //Metodo para reservar este asiento
    public boolean reservarAsiento(int numeroAsiento){
        if(numeroAsiento < 0 || numeroAsiento >= capacidad){
            return false;// El asiento no es valido
        }
        if(asientos[numeroAsiento]){
            return false; // el asiento ya esta reservado
        }
        asientos[numeroAsiento]= true;
        return true;
    }
    //Metodo para verificar si hay asientos disponibles
    public boolean hayAsientosDisponibles(){
        for(boolean asiento : asientos){
            if(!asiento){ //Si enontramos un asiento libre
                return true;
            }
        }
    return false; // no hay aseintos disponibles
    }
    //Metodo para obtener la capacidad de asientos de la sala
    public int getCapacidad (){
        return capacidad;
    }
    
}