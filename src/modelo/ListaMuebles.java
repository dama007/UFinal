
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaMuebles implements Serializable {
    
    private ArrayList<Mueble> lista;

    
    
    public ListaMuebles() {
        lista = new ArrayList<>();
    }
    
    
    public void altaMueble(Mueble m) {
        lista.add(m);
    }
    
    
    public void bajaMueble(Mueble m) {
        lista.remove(m);
    }
    
    public int cantidad() {
        return lista.size();
    }
    
    
    
    public boolean existeMueble(Mueble m) {
        return lista.contains(m);
    }
    
    
    public ListaMuebles stocksMueble(){
        ListaMuebles misStocks = new ListaMuebles();
        for (Mueble m: lista) {
            if ( m.getStock() != 0) {
                misStocks.altaMueble(m);
            }
        }
        return misStocks;
    }
    
    

    public static final String PROP_LISTA = "lista";

    public ArrayList<Mueble> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mueble> lista) {
        ArrayList<Mueble> oldLista = this.lista;
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
