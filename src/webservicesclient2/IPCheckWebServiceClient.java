/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesclient2;


import net.webservicex.*;


/**
 *
 * @author tomek.buslowski
 */
public class IPCheckWebServiceClient {
     public static void main(String[] args) throws Exception {
         
        GeoIPService ipService = new GeoIPService();
        GeoIPServiceSoap serviceMethods = ipService.getGeoIPServiceSoap();
        
        //String ipAddress = args[0];
        //System.out.println("Client 1 IP: " + ipAddress);
        //GeoIP responseIP = ipSoap.getGeoIP("ip");
        
        GeoIP response = serviceMethods.getGeoIPContext();
        System.out.println("By Context:");
        System.out.println("Klient otrzymał - Kod : " + response.getCountryCode());
        System.out.println("Klient otrzymał - Kraj: " + response.getCountryName() );
        System.out.println("Klient otrzymał - IP  : " + response.getIP());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Klient otrzymał - CodeDetails: " + response.getReturnCodeDetails() );
        System.out.println("Klient otrzymał - Code: " + response.getReturnCode() + "\n");
        
        
        response = serviceMethods.getGeoIP(response.getIP());
        System.out.println("By IP:");
        System.out.println("Klient otrzymał - Kod : " + response.getCountryCode());
        System.out.println("Klient otrzymał - Kraj: " + response.getCountryName() );
        System.out.println("Klient otrzymał - IP  : " + response.getIP());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Klient otrzymał - CodeDetails: " + response.getReturnCodeDetails() );
        System.out.println("Klient otrzymał - Code: " + response.getReturnCode() + "\n");
        
        
    }
    
}
