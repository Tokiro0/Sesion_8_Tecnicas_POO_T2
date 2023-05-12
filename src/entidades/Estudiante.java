
package entidades;

/**
 *
 * @author tokiro
 */
public class Estudiante {
    
    private String nombre;
    private String dni;
    private int sexoBiologico;

    public final static int MASCULINO = 0;
    public final static int FEMENINO = 1;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the sexoBiologico
     */
    public int getSexoBiologico() {
        return sexoBiologico;
    }

    /**
     * @param sexoBiologico the sexoBiologico to set
     */
    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    public String getDatosMostrar() {
        return this.nombre = " - DNI: " + this.dni;
    }
}
