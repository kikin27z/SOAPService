
package ws.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addMugiwara complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="addMugiwara">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mugiwara" type="{http://mugiwara.w/}mugiwara" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMugiwara", propOrder = {
    "mugiwara"
})
public class AddMugiwara {

    protected Mugiwara mugiwara;

    /**
     * Obtiene el valor de la propiedad mugiwara.
     * 
     * @return
     *     possible object is
     *     {@link Mugiwara }
     *     
     */
    public Mugiwara getMugiwara() {
        return mugiwara;
    }

    /**
     * Define el valor de la propiedad mugiwara.
     * 
     * @param value
     *     allowed object is
     *     {@link Mugiwara }
     *     
     */
    public void setMugiwara(Mugiwara value) {
        this.mugiwara = value;
    }

}
