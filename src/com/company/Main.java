package com.company;

import javafx.scene.Node;
import java.util.ArrayList;

public class Main {
//Implementacion del Codidgo de Huffman
static Node node;
static Node newRoot;
static String codedString = "";
   public static void main(String[] args) {
String message = "";

//Convertir the string to char array
       char[] msgChar = message.toCharArray();
       ArrayList<Character> characters = new ArrayList<Character>();

       /*Get a list of all the chars which are present in the string
       No repeating the characters! */
       for (int i = 0; i < msgChar.length ; i++) {
           if (!(characters.contains(msgChar[i]))) {
               characters.add(msgChar[i]);

              // print out the available characters
              //System.out.println(characters);
               // Count the number of occurrences of Characters
               int[] countOfChar = new int[characters.size()];
               //Fill the array of counts with one as base value
               for (int x = 0; x < countOfChar.length ; x++) {
                   countOfChar[x] = 0;
               }
               //Do actual counting!
               for (int i1 = 0; i < characters.size() ; i++) {
                   char checker = characters.get(i);
                   for (int x = 0; x < msgChar.length ; x++) {
                       if (checker == msgChar[x]) {
                           countOfChar[i]++;
                       }
                       //Sort the arrays is descending order
                       for (int il = 0; i < countOfChar.length - 1 ; i++) {
                           for (int j = 0; j < countOfChar.length - 1 ; j++) {
                               if (countOfChar[j] < countOfChar[j + 1]){
                                   int temp = countOfChar[j];
                                   countOfChar[j] = countOfChar[j + 1];
                                   countOfChar[j + 1] = temp;

                                   char tempChar = characters.get(j);
                                   characters.set(j, characters.get(j +1));
                                   characters.set(j + 1, tempChar);
                               }
                           }
                       }
                       //print out the frequencies of the Characters

                   }
               }
           }
       }
   }
}
