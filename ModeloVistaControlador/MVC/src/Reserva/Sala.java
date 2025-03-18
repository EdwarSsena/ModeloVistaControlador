
package Reserva;

import java.util.HashSet;
import java.util.Set;

public class Sala {

    private boolean[] asientos;
    private int capacidad;
    private Set<Integer>asientosOcupados;
    
    //Constructor de la sala
    public Sala(int capacidad){
        this.capacidad = capacidad;
        //this.asientos = new boolean[capacidad];//false significa que el asiento esta libre
        this.asientosOcupados = new HashSet<>();
    }
    public boolean hayAsientosDisponibles(){
        return asientosOcupados.size()<capacidad;
    }
    //Metodo para reservar este asiento
    public boolean reservarAsiento(int numeroAsiento){
        if(numeroAsiento < 0 && numeroAsiento <= capacidad && !asientosOcupados.contains(numeroAsiento)){
            return true;// El asiento no es valido
        }
        return false;
        }
        //if(asientos[numeroAsiento]){
          //  return false; // el asiento ya esta reservado
        //}
        public String getAsientosOcupados(){
            return asientosOcupados.toString();
            
        //asientos[numeroAsiento]= true;
        //return true;
    }
        
        public int getCapacidad(){
            return capacidad;
    }
}
    /*Metodo para verificar si hay asientos disponibles
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
    
}*/