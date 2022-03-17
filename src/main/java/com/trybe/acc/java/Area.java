package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Area {
   public static void main(String[] args) {

      /** lê a entrada de um número pelo console */
      Scanner scan = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite a medida do lado do quadrado:");
      /**
       * lê um double:
       * https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448`
       */
      double lado = scan.nextDouble();
      double area = lado * lado;

      System.out.println("A area do quadrado de lado " + lado + " é igual a " + area);

      scan.close();
      /**
       * https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
       */
   }
}