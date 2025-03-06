
package Vista;

import java.util.Scanner;

public class RegistroCliente {
    //se inicia los atributos de la interfas
    private String colorBoton;
    private int numBotones;
    private int numLabel;
    private String colorLabel;
    private String colorFormulario;
    private Scanner objTeclado;
    
    public RegistroCliente(){
        this.colorBoton = "rojo";
        this.numBotones = 5;
        this.numLabel = 10;
        this.colorLabel = "blanco";
        this.colorFormulario = "amarillo";
    }
    public int mostrarMenu(){
        System.out.println("1. Registrar cliente");
        System.out.println("2. ver lista de cliente");
        System.out.println("3. Salir");
        this.objTeclado = new Scanner (System.in);
        System.out.println("Seleccione una opcion...");
        int opcionMenu = objTeclado.nextInt();
        return opcionMenu;
    }    
    public String tomarRegistro_cliente(){
        this.objTeclado = new Scanner (System.in);
        System.out.println("Bienvenido al registro del cliente...");
        System.out.println("Digite el nombre del cliente...");
        String nombreCliente = objTeclado.nextLine();
        System.out.println("Digite el apellido del cliente...");
        String apellidoCliente = objTeclado.nextLine();
        System.out.println("Digite la cedula del clinete....");
        String cedulaCliente = objTeclado.nextLine();
        return nombreCliente;
    }
    }

