
package com.springboot.soap.ws.client.internal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.springboot.soap.ws.client.internal package. 
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

    private final static QName _Params_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "params");
    private final static QName _RequestToPDF_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "requestToPDF");
    private final static QName _ResponseToPDF_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "responseToPDF");
    private final static QName _RequestForPrint_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "requestForPrint");
    private final static QName _ResponseForPrint_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "responseForPrint");
    private final static QName _RequestForDB_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "requestForDB");
    private final static QName _ResponseForDB_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "responseForDB");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.springboot.soap.ws.client.internal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Params }
     * 
     */
    public Params createParams() {
        return new Params();
    }

    /**
     * Create an instance of {@link RequestToPDF }
     * 
     */
    public RequestToPDF createRequestToPDF() {
        return new RequestToPDF();
    }

    /**
     * Create an instance of {@link ResponseToPDF }
     * 
     */
    public ResponseToPDF createResponseToPDF() {
        return new ResponseToPDF();
    }

    /**
     * Create an instance of {@link RequestForPrint }
     * 
     */
    public RequestForPrint createRequestForPrint() {
        return new RequestForPrint();
    }

    /**
     * Create an instance of {@link ResponseForPrint }
     * 
     */
    public ResponseForPrint createResponseForPrint() {
        return new ResponseForPrint();
    }

    /**
     * Create an instance of {@link RequestForDB }
     * 
     */
    public RequestForDB createRequestForDB() {
        return new RequestForDB();
    }

    /**
     * Create an instance of {@link ResponseForDB }
     * 
     */
    public ResponseForDB createResponseForDB() {
        return new ResponseForDB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Params }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Params }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "params")
    public JAXBElement<Params> createParams(Params value) {
        return new JAXBElement<Params>(_Params_QNAME, Params.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestToPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "requestToPDF")
    public JAXBElement<RequestToPDF> createRequestToPDF(RequestToPDF value) {
        return new JAXBElement<RequestToPDF>(_RequestToPDF_QNAME, RequestToPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseToPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseToPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "responseToPDF")
    public JAXBElement<ResponseToPDF> createResponseToPDF(ResponseToPDF value) {
        return new JAXBElement<ResponseToPDF>(_ResponseToPDF_QNAME, ResponseToPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForPrint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestForPrint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "requestForPrint")
    public JAXBElement<RequestForPrint> createRequestForPrint(RequestForPrint value) {
        return new JAXBElement<RequestForPrint>(_RequestForPrint_QNAME, RequestForPrint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseForPrint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseForPrint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "responseForPrint")
    public JAXBElement<ResponseForPrint> createResponseForPrint(ResponseForPrint value) {
        return new JAXBElement<ResponseForPrint>(_ResponseForPrint_QNAME, ResponseForPrint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForDB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestForDB }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "requestForDB")
    public JAXBElement<RequestForDB> createRequestForDB(RequestForDB value) {
        return new JAXBElement<RequestForDB>(_RequestForDB_QNAME, RequestForDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseForDB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseForDB }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "responseForDB")
    public JAXBElement<ResponseForDB> createResponseForDB(ResponseForDB value) {
        return new JAXBElement<ResponseForDB>(_ResponseForDB_QNAME, ResponseForDB.class, null, value);
    }

}
