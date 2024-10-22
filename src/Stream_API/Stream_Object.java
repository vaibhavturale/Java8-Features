package Stream_API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Object {

    public static void main(String[] args) {
        //  1-Blanck
        Stream<Object> emptyStream= Stream.empty();

        //2-Array, Object, Collection
        String names[]={"Vaibhav","Suhag","Chetan"};

        Stream<String> stream1= Stream.of(names);
        stream1.forEach(e ->{
            System.out.println(e);
        });

        // 3- Builder pattern
        Stream<Object> stream2=Stream.builder().build();

        //4- List, Set

        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(35);

//        Stream<Integer> stream3=list2.stream();
//        stream3.forEach(e ->{
//            System.out.println(e);
//        });

        // Iterated by Vaibhav end
//        Iterator<Integer> itr=list2.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }









    }
}
