/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wssoaclient;

import java.util.List;
import ws.client.Mugiwara;
import ws.client.MugiwaraWS;
import ws.client.MugiwaraWS_Service;

/**
 *
 * @author karim
 */
public class WsSoaClient {

    public static void main(String[] args) {
        MugiwaraWS_Service  service = new MugiwaraWS_Service();
        MugiwaraWS port = service.getMugiwaraWSPort();
        List<Mugiwara> mugiwaras = port.getMugiwaras();
        
        for (int i = 0; i < mugiwaras.size(); i++) {
            System.out.println("Mugiwara " + (i+1) +": " + mugiwaras.get(i).getNombre());
        }
        
        Mugiwara bonClay = new Mugiwara();
        bonClay.setNombre("Bon clay");
        bonClay.setRol("Amiguis");
        port.addMugiwara(bonClay);
        
        System.out.println("NUEVOS TRIPILANTES DE SOMBRERO DE PAJA");
        mugiwaras = port.getMugiwaras();
        
        for (int i = 0; i < mugiwaras.size(); i++) {
            System.out.println("Mugiwara " + (i+1) +": " + mugiwaras.get(i).getNombre());
        }
    }
}
