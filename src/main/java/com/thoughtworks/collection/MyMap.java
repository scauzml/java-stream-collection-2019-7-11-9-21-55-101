package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(e->e*3).collect(Collectors.toList());

    }

    public List<String> mapLetter() {

         return array.stream().map(e->{
             char e1=(char)(e+96);
             String letter=String.valueOf(e1);
             return letter;
         }).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
       return array.stream().map(e->{
           int a=e/26;
           char e1;
           char e2;
           String result = null;
           if(a==0){
               result=String.valueOf((char)(e%26+(int)'a'-1));
           }else if(a>0){
               if(a==1){
                   e1=(char)(a+(int)'a'-1);
                   if (e % 26 == 0) {
                       e2='z';
                   }else {
                       e2=(char)(e%26+(int)'a'-1);
                   }
               }else {
                   if (e % 26 == 0) {
                       e1=(char)(a+(int)'a'-2);
                       e2='z';
                   }else {
                       e1=(char)(a+(int)'a'-1);
                       e2=(char)(e%26+(int)'a'-1);
                   }
               }

               result=String.valueOf(e1)+String.valueOf(e2);
           }
           return result;
       }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
      return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
