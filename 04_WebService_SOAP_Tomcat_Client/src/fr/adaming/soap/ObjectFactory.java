
package fr.adaming.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.adaming.soap package. 
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

    private final static QName _CalculSomme_QNAME = new QName("http://soap.adaming.fr/", "calculSomme");
    private final static QName _CalculSommeResponse_QNAME = new QName("http://soap.adaming.fr/", "calculSommeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.adaming.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculSommeResponse }
     * 
     */
    public CalculSommeResponse createCalculSommeResponse() {
        return new CalculSommeResponse();
    }

    /**
     * Create an instance of {@link CalculSomme }
     * 
     */
    public CalculSomme createCalculSomme() {
        return new CalculSomme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculSomme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.adaming.fr/", name = "calculSomme")
    public JAXBElement<CalculSomme> createCalculSomme(CalculSomme value) {
        return new JAXBElement<CalculSomme>(_CalculSomme_QNAME, CalculSomme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculSommeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.adaming.fr/", name = "calculSommeResponse")
    public JAXBElement<CalculSommeResponse> createCalculSommeResponse(CalculSommeResponse value) {
        return new JAXBElement<CalculSommeResponse>(_CalculSommeResponse_QNAME, CalculSommeResponse.class, null, value);
    }

}
