import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Publicacion {
    @Id
    private long ID;

    private String titulo;
    private String contenido;
    private Date fecha;
    private Usuario autor;

    public publicacion(long iD, String titulo, String contenido, Date fecha, Usuario autor) {
        ID = iD;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

}