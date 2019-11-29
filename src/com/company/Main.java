package com.company;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
//Implementacion del Codidgo de Huffman

    public static void main(String[] args) {

        String test = "hola mundo y raimundooo";

        int[] charFreqs = new int[256];
        for (char c : test.toCharArray()) charFreqs[c]++;

        HuffmanTree tree = buildTree(charFreqs);

        System.out.println("TABLA DE CODIGO");
        System.out.println("SIMBOLO\tQUANTIDADE\tHUFFMAN CODIGO");
        printCodes(tree, new StringBuffer());
        //Compactar o texto
        String encode = encode(tree, test);
        //Mostrar el texto compactado
        System.out.println("\nTEXTO COMPACTADO");
        System.out.println(encode); //Tamaño de 40 bits - economia de 72 bits

        //Decodificar o texto
        System.out.println("\n\nTEXTO DECODIFICADO");
        System.out.println(decode(tree,encode));

    }
    public static HuffmanTree buildTree(int[] charfreqs){
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();

        for (int i = 0; i < charfreqs.length; i++){
            if (charfreqs[i] > 0 )
                trees.offer(new HuffmanLeaf(charfreqs[i], (char)i));
        }

        while (trees.size() > 1){
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();

            trees.offer(new HuffmanNode(a, b));
        } return trees.poll();
    }
    public static String encode(HuffmanTree tree, String encode){
        assert tree ! = null;

        String encodeText = "";
        for (char c : encode.toCharArray()){
            encodeText+=(getCodes(tree, new StringBuffer()));
        } return encodeText;
    }
    public static String decode(HuffmanTree, )
}
