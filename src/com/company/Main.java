package com.company;


import java.util.Scanner;

public class Main {
//Implementacion del Codidgo de Huffman

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);


       System.out.println("--------------------------------------------");

       System.out.println("Huffman coding - Presentado por Andrea Avila");

       System.out.println("--------------------------------------------");


       while (true) {

           System.out.println("Escriba el texto a codificar");

           System.out.println("Si desea no continuar con el programa dejelo en blanco y aprete ENTER");

           String text = in.nextLine().trim();


           if (text.isEmpty()) {

               System.out.println("Bye bye!");

               return;

           }

           System.out.println();

           Huffman huff = new Huffman();

           String data = huff.encode(text);


           int normalSize = text.length() * 8;

           int compressedSize = data.length();

           double rate = 100.0 - (compressedSize * 100.0 / normalSize);

           System.out.println("Normal size: " + normalSize);

           System.out.println("Compressed size: " + compressedSize);

           System.out.printf("Compressed is %.2f%% smaller than the original. %n", rate);

           System.out.println();

           System.out.println("Encoded data:");

           System.out.println(data);

           System.out.println();

           System.out.println("Decoded text:");

           System.out.println(huff.decode(data));

           System.out.println();

           System.out.println();
       }
   }

}

