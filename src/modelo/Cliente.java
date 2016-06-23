
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author usu21
 */
public class Cliente implements Serializable, Comparable, Cloneable {
    
    private int codigo;    
    private String nombre;    
    private String apellidos;    
    private String ciudad;    
    private String formaPago;

    
    
    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.ciudad = "";
        this.formaPago = "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    public static final String PROP_FORMAPAGO = "formaPago";

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        String oldFormaPago = this.formaPago;
        this.formaPago = formaPago;
        propertyChangeSupport.firePropertyChange(PROP_FORMAPAGO, oldFormaPago, formaPago);
    }


    public static final String PROP_CIUDAD = "ciudad";

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        String oldCiudad = this.ciudad;
        this.ciudad = ciudad;
        propertyChangeSupport.firePropertyChange(PROP_CIUDAD, oldCiudad, ciudad);
    }


    public static final String PROP_APELLIDOS = "apellidos";

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        propertyChangeSupport.firePropertyChange(PROP_APELLIDOS, oldApellidos, apellidos);
    }


    public static final String PROP_NOMBRE = "nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }


    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
    
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error no se ha podido clonar el objeto");
            return null;
        }
    }

    public int compareTo(Object o) {
        Cliente otro = (Cliente) o;
        return apellidos.compareTo(otro.getApellidos());
    }

    
}
