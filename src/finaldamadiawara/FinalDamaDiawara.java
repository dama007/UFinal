
package finaldamadiawara;

import modelo.ListaClientes;
import modelo.ListaCompras;
import modelo.ListaMuebles;
import utilidades.Fichero;
import vista.Menu;

/**
 *
 * @author usu21
 */


public class FinalDamaDiawara {
    
    
    public static Fichero ficheroClientes;
    public static Fichero ficheroMuebles;
    public static Fichero ficheroCompras;
    
    public static ListaClientes misClientes;
    public static ListaMuebles misMuebles;
    public static ListaCompras misCompras;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ficheroClientes = new Fichero("clientes.xml");
        ficheroMuebles = new Fichero("muebles.xml");
        ficheroCompras = new Fichero("compras.xml");
        
        misClientes = (ListaClientes) ficheroClientes.leer();
        if (misClientes == null) {
            misClientes = new ListaClientes();
        }
        
        misMuebles = (ListaMuebles) ficheroMuebles.leer();
        if (misMuebles == null) {
            misMuebles = new ListaMuebles();
        }
        
        misCompras = (ListaCompras) ficheroCompras.leer();
        if (misCompras == null) {
            misCompras = new ListaCompras();
        }
        
        
        Menu m = new Menu();
        m.setVisible(true);
        
    }
    
}
