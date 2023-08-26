/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumoapi;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Danilo
 */
public class Consumo {
    private String url="https://api.hgbrasil.com/";
    private String token="key=b691540a";
    public String teste(String cidade)throws IOException{
        String chamada = url+"weather?"+token+"&city_name="+cidade+"&mode-summary";
        try{
        URL url = new URL(chamada);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        if (conexao.getResponseCode()!=200){
            throw new IOException("Erro de conexao "+conexao.getResponseCode());
        }
            BufferedReader read = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String leitura="";
            String resp="";
            while ((resp=read.readLine())!=null)
                leitura+=resp;
            return leitura;
        
        
            
        }catch(IOException e){
            System.out.println("Erro de conexao "+e.getMessage());
        }
        return null;
    }
}
