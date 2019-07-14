package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left<right){
            return IntStream.rangeClosed(Math.min(left,right),Math.max(left,right)).boxed()
                    .collect(Collectors.toList());

        }else {
            return IntStream.rangeClosed(Math.min(left,right),Math.max(left,right)).boxed()
                    .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left<right){
            return IntStream.rangeClosed(Math.min(left,right),Math.max(left,right)).boxed().filter(e->e%2==0)
                    .collect(Collectors.toList());

        }else {
            return IntStream.rangeClosed(Math.min(left,right),Math.max(left,right)).boxed().filter(e->e%2==0)
                    .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        }
    }

    public List<Integer> popEvenElments(int[] array) {
      return IntStream.of(array).filter(x->x%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
       return IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
