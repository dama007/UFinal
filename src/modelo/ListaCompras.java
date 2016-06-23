
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaCompras implements Serializable {
    
    
    
    private ArrayList<Compra> lista3;

    
    
    public ListaCompras() {
        lista3 = new ArrayList<>();
    }
    
    
    public void altaCompra(Compra c) {
       lista3.add(c);
    }
    
    
    public void bajaCompra(Compra c) {
        lista3.remove(c);
    }
    
    
    public boolean existeCompra(Compra c) {
        return lista3.contains(c);
    }

    public static final String PROP_LISTA3 = "lista3";

    public ArrayList<Compra> getLista3() {
        return lista3;
    }

    public void setLista3(ArrayList<Compra> lista3) {
        ArrayList<Compra> oldLista3 = this.lista3;
        this.lista3 = lista3;
        propertyChangeSupport.firePropertyChange(PROP_LISTA3, oldLista3, lista3);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
