package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
//        List<Integer> list = new ArrayList<>();
//        list.add(leftBorder);
//        list.add(rightBorder);
//        list=list.stream().sorted().collect(Collectors.toList());
//        List<Integer> list1 = new ArrayList<>();
//        for (int i = list.get(0); i <=list.get(1); i++) {
//          list1.add(i);
//        }
        return IntStream.rangeClosed(Math.min(leftBorder,rightBorder),Math.max(leftBorder,rightBorder))
                .boxed().collect(Collectors.toList()).stream().filter(item->item%2==0).mapToInt(e->e).sum();
        //return list1.stream().filter(e-> e%2==0).mapToInt(e->e).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(e -> e * 3 + 2).mapToInt(e->e).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

      return   arrayList.stream().map(e->{
            if(e%2!=0){
                return  e=e*3+2;
            }else {
                return e;
            }

        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(e->e%2==0).mapToInt(e->e).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
