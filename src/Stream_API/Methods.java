package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {

    public static void main(String[] args) {
        
        //filter(predicate)
           //boolean value function
           // e->e>10

        //map(function)
        /*
        *each element operation
        *
        * */


        

        List<String > names= List.of("Vaibhav","Vaishali", "Vaibhavi","Chetan","Chand","Suhag");
        List<String> newList1=names.stream().filter(e-> e.startsWith("C")).collect(Collectors.toList());
        System.out.println(newList1);

        //square of Numbers
        List<Integer> numbers=List.of(1,2,4,6,8,9,12,23, 44);
        List<Integer> newList2=numbers.stream().map(i ->i*i).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
