package examples;

import java.util.Iterator;

import datastructures.LinkedList;
import interfaces.Visitor;

public class LLTest {

//    public static void main(String... args) {
//        LinkedList<Integer> l = new LinkedList<>();
//        l.append(1);
//        l.append(2);
//        l.append(3);
//        l.append(4);
//        l.append(5);
//        l.addFirst(0);
//
//        Visitor<Integer> imprime = new Visitor<Integer>() {
//            @Override
//            public void visit(Integer data) {
//                System.out.println(data);
//            }
//        };
//
//        Visitor<Integer> imprimeDobro = new Visitor<Integer>() {
//            @Override
//            public void visit(Integer data) {
//                System.out.println(data * 2);
//            }
//        };
//
//        l.foreach(imprime);
//        l.foreach(imprimeDobro);
//        Iterator<Integer> iter = l.reverseIterator();
//        while (iter.hasNext()) {
//            imprime.visit(iter.next());
//        }
//    }
}
