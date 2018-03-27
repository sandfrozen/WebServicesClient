/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.client;

import ws.ServerInfo;
import ws.ServerInfoService;

/**
 *
 * @author tomek.buslowski
 */
public class WsClient {

    public static void main(String[] args) throws Exception {

        ServerInfoService sis = new ServerInfoService();
        ServerInfo si = sis.getServerInfoPort();

        System.out.println(si.getServerName());

    }
}
