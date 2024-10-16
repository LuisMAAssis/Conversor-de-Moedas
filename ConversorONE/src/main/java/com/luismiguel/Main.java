package com.luismiguel;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    
    Scanner valor = new Scanner(System.in);
    Scanner opcao = new Scanner(System.in);
    Conversor conversor = new Conversor();
    
    System.out.println("Conversor de Moeda");

    int sair = 0;
    while (sair != 24) {
      System.out.println("*******************************");
      System.out.println("1) Real brasileiro =>> Peso argentino");
      System.out.println("2) Peso argentino =>> Real brasileiro");
      System.out.println("3) Real brasileiro =>>  Boliviano");
      System.out.println("4) Boliviano =>> Real brasileiro");
      System.out.println("5) Real brasileiro =>> Peso chileno");
      System.out.println("6) Peso chileno =>> Real brasileiro");
      System.out.println("7) Real brasileiro =>> Peso colombiano");
      System.out.println("8) Peso colombiano =>> Real brasileiro");
      System.out.println("9) Real brasileiro =>> Dólar americano");
      System.out.println("10) Dólar americano =>> Real brasileiro");
      System.out.println("11) Real brasileiro =>> Dólar guianense");
      System.out.println("12) Dólar guianense =>> Real brasileiro");
      System.out.println("13) Real brasileiro =>> Guarani");
      System.out.println("14) Guarani =>> Real brasileiro");
      System.out.println("15) Real brasileiro =>> Sol");
      System.out.println("16) Sol =>> Real brasileiro");
      System.out.println("17) Real brasileiro =>> Dólar surinamês");
      System.out.println("18) Dólar surinamês =>> Real brasileiro");
      System.out.println("19) Real brasileiro =>> Peso uruguaio");
      System.out.println("20) Peso uruguaio =>> Real brasileiro");
      System.out.println("21) Real brasileiro =>> Bolívar venezuelano");
      System.out.println("22) Bolívar venezuelano =>> Real brasileiro");
      System.out.println("23) Exibir histórico de conversão");
      System.out.println("24) Sair");
      System.out.println("Selecione uma opção: ");
      System.out.println("*******************************");

      switch (opcao.nextInt()) {
        case 1:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "ARS", valor.nextDouble());
          break;
        case 2:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("ARS", "BRL", valor.nextDouble());
          break;
        case 3:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "BOB", valor.nextDouble());
          break;
        case 4:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BOB", "BRL", valor.nextDouble());
          break;
        case 5:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "CLP", valor.nextDouble());
          break;
        case 6:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("CLP", "BRL", valor.nextDouble());
          break;
        case 7:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "COP", valor.nextDouble());
          break;
        case 8:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("COP", "BRL", valor.nextDouble());
          break;
        case 9:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "USD", valor.nextDouble());
          break;
        case 10:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("USD", "BRL", valor.nextDouble());
          break;
        case 11:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "GYD", valor.nextDouble());
          break;
        case 12:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("GYD", "BRL", valor.nextDouble());
          break;
        case 13:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "PYG", valor.nextDouble());
          break;
        case 14:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("PYG", "BRL", valor.nextDouble());
          break;
        case 15:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "PEN", valor.nextDouble());
          break;
        case 16:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("PEN", "BRL", valor.nextDouble());
          break;
        case 17:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "SRD", valor.nextDouble());
          break;
        case 18:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("SRD", "BRL", valor.nextDouble());
          break;
        case 19:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "UYU", valor.nextDouble());
          break;
        case 20:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("UYU", "BRL", valor.nextDouble());
          break;
        case 21:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("BRL", "VES", valor.nextDouble());
          break;
        case 22:
          System.out.println("Insira o valor que deseja converter: ");
          conversor.moedaConversor("VES", "BRL", valor.nextDouble());
          break;
        case 23:
          System.out.println("Segue histórico de conversão");
          conversor.historico();
          break;
        case 24:
          System.out.println("Encerrando aplicação...");
          sair = 24;
          break;
        default:
          System.out.println("Escolha inválida. Tente novamente!");
      }
    }
  }
}