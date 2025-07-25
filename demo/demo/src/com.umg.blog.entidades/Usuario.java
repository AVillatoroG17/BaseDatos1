import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Usuario {
    @Id
    private long id;
    
    private String nombre;
    private String email;

    public Usuario(long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
