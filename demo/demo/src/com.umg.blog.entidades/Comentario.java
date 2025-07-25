
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comentario {
    @Id
    private long id;
    
    private String texto;
    private Date fecha;
    private Publicacion publicacion;
    private Usuario usuario;


    public Comentario(long id, String texto, Date fecha, Publicacion publicacion, Usuario usuario) {
        this.id = id;
        this.texto = texto;
        this.fecha = fecha;
        this.publicacion = publicacion;
        this.usuario = usuario;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Publicacion getPublicacion() {
        return publicacion;
    }
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}
