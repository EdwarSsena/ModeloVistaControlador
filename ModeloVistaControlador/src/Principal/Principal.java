
package Principal;

import Controlador.Controlador;
import Modelo.Cliente;
import Vista.RegistroCliente;


public class Principal {
    
    public static void main(String[] args){
        //logicaCliente objventana_lo
        Cliente objCliente = new Cliente();
        RegistroCliente objFormulario = new RegistroCliente();
        Controlador objControlador = new Controlador(objCliente,objFormulario);
        objControlador.iniciarFormulario();
    }
}
