
package ws.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddMugiwara_QNAME = new QName("http://mugiwara.w/", "addMugiwara");
    private static final QName _AddMugiwaraResponse_QNAME = new QName("http://mugiwara.w/", "addMugiwaraResponse");
    private static final QName _GetMugiwaras_QNAME = new QName("http://mugiwara.w/", "getMugiwaras");
    private static final QName _GetMugiwarasResponse_QNAME = new QName("http://mugiwara.w/", "getMugiwarasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMugiwara }
     * 
     * @return
     *     the new instance of {@link AddMugiwara }
     */
    public AddMugiwara createAddMugiwara() {
        return new AddMugiwara();
    }

    /**
     * Create an instance of {@link AddMugiwaraResponse }
     * 
     * @return
     *     the new instance of {@link AddMugiwaraResponse }
     */
    public AddMugiwaraResponse createAddMugiwaraResponse() {
        return new AddMugiwaraResponse();
    }

    /**
     * Create an instance of {@link GetMugiwaras }
     * 
     * @return
     *     the new instance of {@link GetMugiwaras }
     */
    public GetMugiwaras createGetMugiwaras() {
        return new GetMugiwaras();
    }

    /**
     * Create an instance of {@link GetMugiwarasResponse }
     * 
     * @return
     *     the new instance of {@link GetMugiwarasResponse }
     */
    public GetMugiwarasResponse createGetMugiwarasResponse() {
        return new GetMugiwarasResponse();
    }

    /**
     * Create an instance of {@link Mugiwara }
     * 
     * @return
     *     the new instance of {@link Mugiwara }
     */
    public Mugiwara createMugiwara() {
        return new Mugiwara();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMugiwara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMugiwara }{@code >}
     */
    @XmlElementDecl(namespace = "http://mugiwara.w/", name = "addMugiwara")
    public JAXBElement<AddMugiwara> createAddMugiwara(AddMugiwara value) {
        return new JAXBElement<>(_AddMugiwara_QNAME, AddMugiwara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMugiwaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMugiwaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mugiwara.w/", name = "addMugiwaraResponse")
    public JAXBElement<AddMugiwaraResponse> createAddMugiwaraResponse(AddMugiwaraResponse value) {
        return new JAXBElement<>(_AddMugiwaraResponse_QNAME, AddMugiwaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMugiwaras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMugiwaras }{@code >}
     */
    @XmlElementDecl(namespace = "http://mugiwara.w/", name = "getMugiwaras")
    public JAXBElement<GetMugiwaras> createGetMugiwaras(GetMugiwaras value) {
        return new JAXBElement<>(_GetMugiwaras_QNAME, GetMugiwaras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMugiwarasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMugiwarasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mugiwara.w/", name = "getMugiwarasResponse")
    public JAXBElement<GetMugiwarasResponse> createGetMugiwarasResponse(GetMugiwarasResponse value) {
        return new JAXBElement<>(_GetMugiwarasResponse_QNAME, GetMugiwarasResponse.class, null, value);
    }

}
