package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

//  QUE: Create List and filter the even numbers from List

//  1) Ways to create List
        List<Integer> list1=List.of(1,3,29,10);
        System.out.println(list1);

//  2) Ways to create List
        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(35);
        System.out.println(list2);

//  3) Ways to create List
        List<Integer> list3= Arrays.asList(1,3,5,6,8);
        System.out.println(list3);
// ---------------------------------------------------
//        List1 - Filter Even number
//        Without Stream
        List<Integer> evenList=new ArrayList<>();
        for (int i: list1){
            if(i % 2 == 0){
                evenList.add(i);
            }
        }
        System.out.println(list1);
//        System.out.println(evenList);

//        Using Stream API
       Stream<Integer> stream=list1.stream();
       List<Integer> newList= stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
