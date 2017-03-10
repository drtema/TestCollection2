package com.brainacad.oop.testcollection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dr.tema on 10.03.17.
 */
public class Main {
    public static void main(String... a){
        List<String> arrayList = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random()*arrayList.size()),"number_" + i);
        }

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
