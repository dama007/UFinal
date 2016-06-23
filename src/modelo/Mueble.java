
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author usu21
 */
public class Mueble implements Serializable {
    
    private int idMueble;    
    private String descripcion;    
    private double precio;    
    private int stock;

    public static final String PROP_STOCK = "stock";

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        int oldStock = this.stock;
        this.stock = stock;
        propertyChangeSupport.firePropertyChange(PROP_STOCK, oldStock, stock);
    }


    public static final String PROP_PRECIO = "precio";

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        double oldPrecio = this.precio;
        this.precio = precio;
        propertyChangeSupport.firePropertyChange(PROP_PRECIO, oldPrecio, precio);
    }


    public static final String PROP_DESCRIPCION = "descripcion";

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }


    public static final String PROP_IDMUEBLE = "idMueble";

    public int getIdMueble() {
        return idMueble;
    }

    public void setIdMueble(int idMueble) {
        int oldIdMueble = this.idMueble;
        this.idMueble = idMueble;
        propertyChangeSupport.firePropertyChange(PROP_IDMUEBLE, oldIdMueble, idMueble);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
    
    
}
