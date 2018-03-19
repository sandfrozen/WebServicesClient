/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesclient;

import hw.HelloWorld;
import hw.HelloWorldImplService;

/**
 *
 * @author tomek.buslowski
 */
public class WebServicesClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        
        String zapytanie = "To ja - KLIENT";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Client 1");
        System.out.println("Klietn wysłał: " + zapytanie);
        System.out.println("Klietn otrzymał: " + response);
        
    }
    
}
