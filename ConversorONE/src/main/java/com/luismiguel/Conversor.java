package com.luismiguel;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor{

  Registro registro = new Registro();

  public void moedaConversor(String base_code, String target_code, double value) throws IOException {

    String url_str = "https://v6.exchangerate-api.com/v6/940ab0b2a7addd4f1a2a1d8c/pair/" + base_code + "/" + target_code + "/" + value;

    URL url = new URL(url_str);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.connect();

    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();

    String req_result = jsonobj.get("conversion_result").getAsString();
    String result = "O resultado é de " + value + " " + base_code + " para " + target_code + " tem o valor final de " + req_result;
    registro.registrarLog(result);
    System.out.println(result);

  }

  public void historico() {
    registro.exibirHistorico();
  }
}