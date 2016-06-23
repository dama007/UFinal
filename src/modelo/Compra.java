
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author usu21
 */
public class Compra implements Serializable {
    
    private int idCompra;    
    private Date fecha;   
    private Cliente cliente;   
    private Mueble mueble;
    
    private int cantidad;

    public static final String PROP_CANTIDAD = "cantidad";

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        int oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, cantidad);
    }


    public static final String PROP_MUEBLE = "mueble";

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        Mueble oldMueble = this.mueble;
        this.mueble = mueble;
        propertyChangeSupport.firePropertyChange(PROP_MUEBLE, oldMueble, mueble);
    }


    public static final String PROP_CLIENTE = "cliente";

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente oldCliente = this.cliente;
        this.cliente = cliente;
        propertyChangeSupport.firePropertyChange(PROP_CLIENTE, oldCliente, cliente);
    }


    public static final String PROP_FECHA = "fecha";

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        propertyChangeSupport.firePropertyChange(PROP_FECHA, oldFecha, fecha);
    }


    public static final String PROP_IDCOMPRA = "idCompra";

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        int oldIdCompra = this.idCompra;
        this.idCompra = idCompra;
        propertyChangeSupport.firePropertyChange(PROP_IDCOMPRA, oldIdCompra, idCompra);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
