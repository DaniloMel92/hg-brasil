/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumoapi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Danilo
 */
public class ConsumoApi {

    public static void main(String[] args)throws IOException {
        Consumo consumo = new Consumo();
        OutputStream gravar = new FileOutputStream("c:/users/danilo/desktop/clima.txt");
        byte[] textoByte = consumo.teste("Luziania,GO").getBytes();
       gravar.write(textoByte);
       gravar.close();
    }
}
