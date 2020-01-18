
package com.springboot.soap.ws.service.internal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.springboot.soap.ws.service.internal package. 
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
    private final static QName _FirstRequest_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "firstRequest");
    private final static QName _FirstResponse_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "firstResponse");
    private final static QName _SecondRequest_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "secondRequest");
    private final static QName _SecondResponse_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "secondResponse");
    private final static QName _ThirdRequest_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "thirdRequest");
    private final static QName _ThirdResponse_QNAME = new QName("http://schemas.soapws.com/test/ws/soapws", "thirdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.springboot.soap.ws.service.internal
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
     * Create an instance of {@link FirstRequest }
     * 
     */
    public FirstRequest createFirstRequest() {
        return new FirstRequest();
    }

    /**
     * Create an instance of {@link FirstResponse }
     * 
     */
    public FirstResponse createFirstResponse() {
        return new FirstResponse();
    }

    /**
     * Create an instance of {@link SecondRequest }
     * 
     */
    public SecondRequest createSecondRequest() {
        return new SecondRequest();
    }

    /**
     * Create an instance of {@link SecondResponse }
     * 
     */
    public SecondResponse createSecondResponse() {
        return new SecondResponse();
    }

    /**
     * Create an instance of {@link ThirdRequest }
     * 
     */
    public ThirdRequest createThirdRequest() {
        return new ThirdRequest();
    }

    /**
     * Create an instance of {@link ThirdResponse }
     * 
     */
    public ThirdResponse createThirdResponse() {
        return new ThirdResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FirstRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "firstRequest")
    public JAXBElement<FirstRequest> createFirstRequest(FirstRequest value) {
        return new JAXBElement<FirstRequest>(_FirstRequest_QNAME, FirstRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FirstResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "firstResponse")
    public JAXBElement<FirstResponse> createFirstResponse(FirstResponse value) {
        return new JAXBElement<FirstResponse>(_FirstResponse_QNAME, FirstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecondRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "secondRequest")
    public JAXBElement<SecondRequest> createSecondRequest(SecondRequest value) {
        return new JAXBElement<SecondRequest>(_SecondRequest_QNAME, SecondRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecondResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "secondResponse")
    public JAXBElement<SecondResponse> createSecondResponse(SecondResponse value) {
        return new JAXBElement<SecondResponse>(_SecondResponse_QNAME, SecondResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThirdRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "thirdRequest")
    public JAXBElement<ThirdRequest> createThirdRequest(ThirdRequest value) {
        return new JAXBElement<ThirdRequest>(_ThirdRequest_QNAME, ThirdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThirdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.soapws.com/test/ws/soapws", name = "thirdResponse")
    public JAXBElement<ThirdResponse> createThirdResponse(ThirdResponse value) {
        return new JAXBElement<ThirdResponse>(_ThirdResponse_QNAME, ThirdResponse.class, null, value);
    }

}
