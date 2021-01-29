package com.tts;

import com.tts.lambdasInterface.Mathfunctions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    interface IntegerMath{
        int operations(int a, int b);
    }

    public static void main(String[] args) {
        IntegerMath addition = (a, b) -> a+b;
        System.out.println(addition.operations(4,5));

        AnotherClass<Integer, String> myClass = new AnotherClass<>(12, "Hello");
        int numVal = myClass.getThingOne();
        String strVal = myClass.getThingTwo();

        AnotherClass<String, String> myClass2 = new AnotherClass<>("12", "Hello");
        String numVal2 = myClass2.getThingOne();
        String numVal3 = myClass2.getThingTwo();

//        System.out.println("Printing everything");
//        System.out.println("numVal: " + numVal);
//        System.out.println("strVal: " + strVal);
//        System.out.println("numVal2: " + numVal2);
//        System.out.println("numVal3: " + numVal3);

        // Using Set

        Set<String> newSet = new HashSet<>();
        newSet.add("one");
        newSet.add("Two");
        newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("one");
        newSet2.add("Two");
        newSet2.add("Spring");

        Set<String> setResult = printStuff(newSet, newSet2);
//        Iterator<String> myItr = setResult.iterator();
//        while(myItr.hasNext()) {
//            System.out.println(myItr);
//        }
        for (String s : setResult) {
//            System.out.println(s);
        }
// From the interface IntMath
        Mathfunctions mathOp = new Mathfunctions();
        int add = mathOp.operations(4, 4);

        System.out.println(add);

    }
    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo) { // here 'E' is placeholder or alias

        Set <E>result = new HashSet<>(setOne);
        result.addAll(setTwo);
        return result;
    }
    }
