
package Proveedor;


public class Proveedor {
    
    //Atributos de la clase
    private String nombreProveedor;
    private String []listaProveedores;
    private int contador;
    
    //Constructor
    public Proveedor(){
        this.nombreProveedor ="";
        this.contador = 0;
        
        //Lista estatica de proveedores
        this.listaProveedores = new String[3];
    }
    // Metodo para los atributos
    public String getNombreProveedor(){
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor){
        this.nombreProveedor = nombreProveedor;
    }
    public String[] getListaProveedores(){
        return listaProveedores;
    }
    //Metodo para guardar los proveedores
    public void guardarProveedores (String datoNombre){
     if (contador < this.listaProveedores.length){
         this.listaProveedores [this.contador] = datoNombre;
         this.contador++;
         System.out.println("Proveedor guardado..");
     }else{
         System.out.println("No se puede guardar mas proveedores lista llena..");
        }
    }
     //metodo para imprimir proveedor
     public void imprimirProveedores(){
         if (this.contador == 0){
             System.out.println("No hay proveedores registrados..");
         }else{
             for (int i = 0; i < this.contador; i++){
                 System.out.println("Proveedor "+ (i+1)+" : "+this.listaProveedores[i]);
            }
        }
         
    }
}

