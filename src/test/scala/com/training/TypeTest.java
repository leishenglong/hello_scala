package com.training;

import java.util.ArrayList;
import java.util.List;

public class TypeTest {

    public static void main(String[] args) {
        List<String> aList   = new ArrayList<>();
        List<? extends Object> covariantList = aList;
        List<? super String> contravariantList = aList;
//        covariantList.add("d"); //wrong
        Object a = covariantList.get(0);
        contravariantList.add("d"); //OK
//        String b = contravariantList.get(1); //wrong
        Object c = contravariantList.get(2);
    }
}
