/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.TPV;
import javax.xml.soap.*;
/**
 *
 * @author Rodrigo
 */
public class GeneradorComp {
    private TPV terminal;

    public GeneradorComp(TPV terminal) {
        this.terminal= terminal;
    }
    
    String soapEndpointUrl = "https://wswhomo.afip.gov.ar/wsfev1/service.asmx";
    String soapAction = "http://ar.gov.afip.dif.FEV1/FECAESolicitar";
    
    
    public void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        Autorizacion au = solicitarAutorizacion("7D8B2CDC-82DF-4A0C-81D8-231AB1AD10FC");
        String token = au.getToken().getValue();
        String sign = au.getSign().getValue();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "ar";
        String myNamespaceURI = "http://ar.gov.afip.dif.FEV1/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

            

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("FECAESolicitar", myNamespace, "http://ar.gov.afip.dif.FEV1/");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("Auth", myNamespace);
        SOAPElement soapBodyElem2 = soapBodyElem1.addChildElement("Token", myNamespace);
        soapBodyElem2.addTextNode(token);
        SOAPElement soapBodyElem3 = soapBodyElem1.addChildElement("Sign", myNamespace);
        soapBodyElem3.addTextNode(sign);
        SOAPElement soapBodyElem4 = soapBodyElem1.addChildElement("Cuit", myNamespace);
        soapBodyElem4.addTextNode(au.getCuit().toString());
        SOAPElement soapBodyElem5 = soapBodyElem.addChildElement("FeCAEReq", myNamespace);
        SOAPElement soapBodyElem6 = soapBodyElem5.addChildElement("FeCabReq", myNamespace);
        SOAPElement soapBodyElem7 = soapBodyElem6.addChildElement("CantReg", myNamespace);
        soapBodyElem7.addTextNode("1");
        SOAPElement soapBodyElem8 = soapBodyElem6.addChildElement("PtoVta", myNamespace);
        soapBodyElem8.addTextNode(Integer.toString(terminal.getNumero()));
        SOAPElement soapBodyElem9 = soapBodyElem6.addChildElement("CbteTipo", myNamespace);
        soapBodyElem9.addTextNode("11");
        SOAPElement soapBodyElem10 = soapBodyElem5.addChildElement("FeDetReq", myNamespace);
        SOAPElement soapBodyElem11 = soapBodyElem10.addChildElement("FECAEDetRequest", myNamespace);
        SOAPElement soapBodyElem12 = soapBodyElem11.addChildElement("Concepto", myNamespace);
        soapBodyElem12.addTextNode("1");
        SOAPElement soapBodyElem13 = soapBodyElem11.addChildElement("DocTipo", myNamespace);
        soapBodyElem13.addTextNode("96");
        SOAPElement soapBodyElem14 = soapBodyElem11.addChildElement("DocNro", myNamespace);
        soapBodyElem14.addTextNode(Integer.toString(terminal.getVenta().getCliente().getDni()));
        SOAPElement soapBodyElem15 = soapBodyElem11.addChildElement("CbteDesde", myNamespace);
        soapBodyElem15.addTextNode("1");
        SOAPElement soapBodyElem16 = soapBodyElem11.addChildElement("CbteHasta", myNamespace);
        soapBodyElem16.addTextNode("1");
        SOAPElement soapBodyElem17 = soapBodyElem11.addChildElement("CbteFch", myNamespace);
        soapBodyElem17.addTextNode(Integer.toString(terminal.getVenta().getAñoVenta())+Integer.toString(terminal.getVenta().getMesVenta())+Integer.toString(terminal.getVenta().getDiaVenta()));
        SOAPElement soapBodyElem18 = soapBodyElem11.addChildElement("ImpTotal", myNamespace);
        soapBodyElem18.addTextNode(Double.toString(terminal.getVenta().getTotal()));
        SOAPElement soapBodyElem19 = soapBodyElem11.addChildElement("ImpTotalConc", myNamespace);
        soapBodyElem19.addTextNode("0");
        SOAPElement soapBodyElem20 = soapBodyElem11.addChildElement("ImpNeto", myNamespace);
        soapBodyElem20.addTextNode(Double.toString(terminal.getVenta().getNeto()));
        SOAPElement soapBodyElem21 = soapBodyElem11.addChildElement("ImpOpEx", myNamespace);
        soapBodyElem21.addTextNode("0");
        SOAPElement soapBodyElem22 = soapBodyElem11.addChildElement("ImpTrib", myNamespace);
        soapBodyElem22.addTextNode("7.8");
        SOAPElement soapBodyElem23 = soapBodyElem11.addChildElement("ImpIVA", myNamespace);
        soapBodyElem23.addTextNode("0");
        SOAPElement soapBodyElem24 = soapBodyElem11.addChildElement("FchServDesde", myNamespace);
        soapBodyElem24.addTextNode("");
        SOAPElement soapBodyElem25 = soapBodyElem11.addChildElement("FchServHasta", myNamespace);
        soapBodyElem25.addTextNode("");
        SOAPElement soapBodyElem26 = soapBodyElem11.addChildElement("FchVtoPago", myNamespace);
        soapBodyElem26.addTextNode("");
        SOAPElement soapBodyElem27 = soapBodyElem11.addChildElement("MonId", myNamespace);
        soapBodyElem27.addTextNode("PES");
        SOAPElement soapBodyElem28 = soapBodyElem11.addChildElement("MonCotiz", myNamespace);
        soapBodyElem28.addTextNode("1");
        SOAPElement soapBodyElem29 = soapBodyElem11.addChildElement("Tributos", myNamespace);
        SOAPElement soapBodyElem30 = soapBodyElem29.addChildElement("Tributo", myNamespace);
        SOAPElement soapBodyElem31 = soapBodyElem30.addChildElement("Id", myNamespace);
        soapBodyElem31.addTextNode("1");
        SOAPElement soapBodyElem32 = soapBodyElem30.addChildElement("Desc", myNamespace);
        soapBodyElem32.addTextNode("Impuestos Nacionales");
        SOAPElement soapBodyElem33 = soapBodyElem30.addChildElement("BaseImp", myNamespace);
        soapBodyElem33.addTextNode("150");
        SOAPElement soapBodyElem34 = soapBodyElem30.addChildElement("Alic", myNamespace);
        soapBodyElem34.addTextNode("0");
        SOAPElement soapBodyElem35 = soapBodyElem30.addChildElement("Importe", myNamespace);
        soapBodyElem35.addTextNode("0");
        SOAPElement soapBodyElem36 = soapBodyElem11.addChildElement("Iva", myNamespace);
        SOAPElement soapBodyElem37 = soapBodyElem36.addChildElement("AlicIva", myNamespace);
        SOAPElement soapBodyElem38 = soapBodyElem37.addChildElement("Id", myNamespace);
        soapBodyElem38.addTextNode("5");
        SOAPElement soapBodyElem39 = soapBodyElem37.addChildElement("BaseImp", myNamespace);
        soapBodyElem39.addTextNode("100");
        SOAPElement soapBodyElem40 = soapBodyElem37.addChildElement("Importe", myNamespace);
        soapBodyElem40.addTextNode("21");
        SOAPElement soapBodyElem41 = soapBodyElem36.addChildElement("AlicIva", myNamespace);
        SOAPElement soapBodyElem42 = soapBodyElem41.addChildElement("Id", myNamespace);
        soapBodyElem42.addTextNode("0");
        SOAPElement soapBodyElem43 = soapBodyElem41.addChildElement("BaseImp", myNamespace);
        soapBodyElem43.addTextNode("0");
        SOAPElement soapBodyElem44 = soapBodyElem41.addChildElement("Importe", myNamespace);
        soapBodyElem44.addTextNode("0");
        
        
        //SOAPElement soapBodyElem10 = soapBodyElem7.addChildElement("FECAEDetRequest", myNamespace);
        
        
    }

    public void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        this.createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }

    private static Autorizacion solicitarAutorizacion(java.lang.String codigo) {
        Controlador.LoginService service = new Controlador.LoginService();
        Controlador.ILoginService port = service.getSGEAuthService();
        return port.solicitarAutorizacion(codigo);
    }

    

}
