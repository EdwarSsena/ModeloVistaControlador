
package Controlador;

import Modelo.Cliente;

import Vista.RegistroCliente;

public class Controlador{
    private RegistroCliente objFormulario_registro;
    
    private Cliente objModelo_Cliente;
    
    //se crea el constructor
    public Controlador (Cliente obCliente,RegistroCliente objFormulario){
        this.objModelo_Cliente = objModelo_Cliente;
        this.objFormulario_registro = objFormulario;
        
    }
//Metodo que inicia la ejecucion del formulario
    public void iniciarFormulario(){
        int opcion = 0;
        do{
            opcion = this.objFormulario_registro.mostrarMenu();
            switch (opcion) {
                case 1:
                    String auxNombre = this.objFormulario_registro.tomarRegistro_cliente();
                    this.objModelo_Cliente.guardarCliente(auxNombre);
                    break;
                
                case 2:
                    this.objModelo_Cliente.imprimirClientes();
                    
                    break;
                    
                case 3:
                    System.out.println("Saliendo del sistema....");
                    break;
                    
                default:
                    System.out.println("Opcion no valida...");
            }
        }while (opcion !=3);
    }
}


