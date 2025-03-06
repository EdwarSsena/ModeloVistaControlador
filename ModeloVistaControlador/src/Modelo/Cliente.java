
package Modelo;


public class Cliente {
    
    //Atributos de la clase
    private String nombreCliente;
    private String [] listaClientes;
    private int contador;

    //Metodo Constructor
    public Cliente(){
        this.nombreCliente ="";
        this.contador = 0;
        // LIsta estatica de clientes
        this.listaClientes = new String[3];
    }
    //Metodos normales de los Atributos
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente (String nombreCliente){
        this.nombreCliente =  nombreCliente;
    }
    public String [] getListaCliente (){
        return listaClientes;
    }
    //metodos normales del cliente
    public void guardarCliente(String datoNombre){
        if(this.contador < this.listaClientes.length){
            this.listaClientes[this.contador] = datoNombre;
            this.contador++;
            
            System.out.println("informacion guardar...");
        }else{
            System.out.println("No se puede guardar el nombre lista llena...");
        }
    }
   
    public void imprimirClientes() {
        if (this.contador == 0) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (int i = 0; i < this.contador; i++) { 
                System.out.println("Cliente " + (i + 1) + ": " + this.listaClientes[i]); 
            }
        }
    }
}
    


