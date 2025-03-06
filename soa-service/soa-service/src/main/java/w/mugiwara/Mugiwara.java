package w.mugiwara;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author karim
 */
@Entity
public class Mugiwara implements Serializable {

    private static final long serialVersionUID = 1L;

    public static List<Mugiwara> mugiwaras = new ArrayList<>(Arrays.asList(
            new Mugiwara("Luffy", "Capitan"),
            new Mugiwara("Zoro", "Primer Comandante")));
    public String rol, nombre;

    public Mugiwara() {
        super();
    }

    public Mugiwara(String nombre, String rol) {
        super();
        this.rol = rol;
        this.nombre = nombre;
    }

    public static List<Mugiwara> getMugiwaras() {
        return mugiwaras;
    }
}
