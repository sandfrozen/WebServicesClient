/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesclient;

import hw.HelloWorld;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author tomek.buslowski
 */
public class WebServicesClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
        //QName qname = new QName("http://rsi.jg.org/", "HelloWorldImplService");
        QName qname = new QName("http://hw/", "HelloWorldImplService");
           
        // ZROBIĆ
        // Ćwiczenie 5. Monitorowanie pracy serwisu
        Service service = Service.create(url, qname);   
        HelloWorld hello = service.getPort(HelloWorld.class);
        
        String zapytanie = "To ja - KLIENT";
        String response = hello.getHelloWorldAsString(zapytanie);
        
        System.out.println("Client 1");
        System.out.println("Klietn wysłał: " + zapytanie);
        System.out.println("Klietn otrzymał: " + response);
        
    }
    
}
