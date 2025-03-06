package w.mugiwara;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.List;

/**
 *
 * @author karim
 */
@WebService(serviceName = "MugiwaraWS")
public class MugiwaraWS {

    @WebMethod(operationName = "getMugiwaras")
    public List<Mugiwara> getJugadores() {
        return Mugiwara.getMugiwaras();
    }
    
    @WebMethod(operationName = "addMugiwara")
    public void addJugador(@WebParam(name = "mugiwara") Mugiwara mugiwara) {
        Mugiwara.getMugiwaras().add(mugiwara);
    }
}
