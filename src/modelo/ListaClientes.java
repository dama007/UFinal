
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaClientes implements Serializable {
    
    private ArrayList<Cliente> lista;

    
    
    public ListaClientes() {
        lista = new ArrayList<>();
    }
    
    
    public void altaCliente(Cliente c) {
        lista.add(c);
    }
    
    
    public void bajaCliente (Cliente c) {
        lista.remove(c);
    }
    
    
    public boolean existeCliente(Cliente c) {
        return lista.contains(c);
    }
    
    
    public ListaClientes copiaClientes() {
        ListaClientes copia = new ListaClientes();
        for (Cliente c : lista) {
            copia.altaCliente(c);
        }
        return copia;
    }

    public static final String PROP_LISTA = "lista";

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        ArrayList<Cliente> oldLista = this.lista;
        this.lista = lista;
        propertyChangeSupport.firePropertyChange(PROP_LISTA, oldLista, lista);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
    
    
}
