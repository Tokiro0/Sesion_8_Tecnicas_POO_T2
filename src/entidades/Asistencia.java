package entidades;

/**
 *
 * @author tokiro
 */
public class Asistencia {

    private int fecha;
    private Estudiante estudiante;
    private Turno turno;

    public Asistencia(Estudiante estudiante, Turno turno) {

        this.estudiante = estudiante;
        this.turno = turno;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

}
