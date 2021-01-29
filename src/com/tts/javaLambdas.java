package com.tts;

import java.util.ArrayList;

public class javaLambdas {
    public void arrayStuff(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Bob");
        students.add("Jessica");
        students.add("Dave");

        // Here is the lambda expression
        students.forEach(student -> System.out.println(student));
        // don't need to declare it in the 'forEach'

        //could also use
        //students.forEach(student -> {
        // if(student.substring(0,1).equals("J")){    ---could also use idx.substring... instead of student---
        //System.out.println(student);           ---substring requires index range; .equals specifies search parameter
    }
}
