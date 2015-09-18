/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacoes;

import datastructures.LinkedList;
import interfaces.Visitor;
import java.util.Iterator;

/**
 *
 * @author Cristiano
 */
public class Main {

    public static void main(String... args) {
        Celula cel1 = new Celula("a1", "5*10+35", "10");
        Celula cel2 = new Celula("a2", "5*10+35", "10");
        Celula cel3 = new Celula("a3", "5*10+35", "10");
        Celula cel4 = new Celula("a4", "5*10+35", "10");
        Celula cel5 = new Celula("a1", "5*10+35", "10");

        System.out.println(retornarMarior(cel1, cel2));
        System.out.println(retornarMarior(cel2, cel3));
        System.out.println(retornarMarior(cel4, cel3));
        System.out.println(retornarMarior(cel5, cel3));
        System.out.println(retornarMarior(cel1, cel5));
    }

    private static String retornarMarior(Celula celA, Celula celB) {

        if (celA.compareTo(celB) == 0) {
            return celA.getIndice() + " igual a " + celB.getIndice();
        }

        if (celA.compareTo(celB) > 0) {
            return celA.getIndice();
        }

        if (celA.compareTo(celB) < 0) {
            return celB.getIndice();
        }

        return "";
    }
}
