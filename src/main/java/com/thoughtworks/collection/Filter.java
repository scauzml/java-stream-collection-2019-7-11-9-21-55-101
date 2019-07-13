package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
       return array.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {

        return array.stream().filter(integer -> integer%3==0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
      return   firstList.stream().filter(num -> secondList.contains(num)).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
         return new ArrayList<Integer>(array.stream().collect(Collectors.toSet())) ;
        //return array.stream().distinct().collect(Collectors.toList());


    }

}