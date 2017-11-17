
package fr.adaming.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.adaming.webservice package. 
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

    private final static QName _GetAllComptesResponse_QNAME = new QName("http://webservice.adaming.fr/", "getAllComptesResponse");
    private final static QName _ConversionEuroToDinarResponse_QNAME = new QName("http://webservice.adaming.fr/", "conversionEuroToDinarResponse");
    private final static QName _GetCompteById_QNAME = new QName("http://webservice.adaming.fr/", "getCompteById");
    private final static QName _GetCompteByIdResponse_QNAME = new QName("http://webservice.adaming.fr/", "getCompteByIdResponse");
    private final static QName _GetAllComptes_QNAME = new QName("http://webservice.adaming.fr/", "getAllComptes");
    private final static QName _Compte_QNAME = new QName("http://webservice.adaming.fr/", "compte");
    private final static QName _ConversionEuroToDinar_QNAME = new QName("http://webservice.adaming.fr/", "conversionEuroToDinar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.adaming.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllComptesResponse }
     * 
     */
    public GetAllComptesResponse createGetAllComptesResponse() {
        return new GetAllComptesResponse();
    }

    /**
     * Create an instance of {@link GetCompteByIdResponse }
     * 
     */
    public GetCompteByIdResponse createGetCompteByIdResponse() {
        return new GetCompteByIdResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDinarResponse }
     * 
     */
    public ConversionEuroToDinarResponse createConversionEuroToDinarResponse() {
        return new ConversionEuroToDinarResponse();
    }

    /**
     * Create an instance of {@link GetCompteById }
     * 
     */
    public GetCompteById createGetCompteById() {
        return new GetCompteById();
    }

    /**
     * Create an instance of {@link GetAllComptes }
     * 
     */
    public GetAllComptes createGetAllComptes() {
        return new GetAllComptes();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConversionEuroToDinar }
     * 
     */
    public ConversionEuroToDinar createConversionEuroToDinar() {
        return new ConversionEuroToDinar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "getAllComptesResponse")
    public JAXBElement<GetAllComptesResponse> createGetAllComptesResponse(GetAllComptesResponse value) {
        return new JAXBElement<GetAllComptesResponse>(_GetAllComptesResponse_QNAME, GetAllComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDinarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "conversionEuroToDinarResponse")
    public JAXBElement<ConversionEuroToDinarResponse> createConversionEuroToDinarResponse(ConversionEuroToDinarResponse value) {
        return new JAXBElement<ConversionEuroToDinarResponse>(_ConversionEuroToDinarResponse_QNAME, ConversionEuroToDinarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "getCompteById")
    public JAXBElement<GetCompteById> createGetCompteById(GetCompteById value) {
        return new JAXBElement<GetCompteById>(_GetCompteById_QNAME, GetCompteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "getCompteByIdResponse")
    public JAXBElement<GetCompteByIdResponse> createGetCompteByIdResponse(GetCompteByIdResponse value) {
        return new JAXBElement<GetCompteByIdResponse>(_GetCompteByIdResponse_QNAME, GetCompteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "getAllComptes")
    public JAXBElement<GetAllComptes> createGetAllComptes(GetAllComptes value) {
        return new JAXBElement<GetAllComptes>(_GetAllComptes_QNAME, GetAllComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDinar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaming.fr/", name = "conversionEuroToDinar")
    public JAXBElement<ConversionEuroToDinar> createConversionEuroToDinar(ConversionEuroToDinar value) {
        return new JAXBElement<ConversionEuroToDinar>(_ConversionEuroToDinar_QNAME, ConversionEuroToDinar.class, null, value);
    }

}
