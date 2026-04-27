package DAOsTransparencia;

import java.util.Date;

public class Alumno {
    private final int TAM_NOMBRE = 30; 
    private int id; 
    private String nombre;
    private Date fNacimiento;
    private double notaMedia;
    private String curso; 

    public Alumno(int id) {
        this.id = id;
    }
    
    public Alumno(int id, String nombre, Date fNacimiento, double notaMedia, String curso) {
        this.id = id;
        setNombre(nombre);
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.setCurso(curso);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, Math.min(TAM_NOMBRE, nombre.length()));
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso.substring(0, Math.min(2, nombre.length()));
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + 
               ", fNacimiento=" + fNacimiento + ", notaMedia=" + notaMedia + 
               ", curso=" + curso + '}';
    } 
}