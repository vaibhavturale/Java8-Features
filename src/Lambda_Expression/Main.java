package Lambda_Expression;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Lambda Expression");

// 1) Create Seperate class and implement this interface
//        MyInterf m1=new MyInterImpl();
//        m1.hello();

//2) Using ANONYMOUS class for implementing interface

//        MyInterf i=new MyInterf() {
//            @Override
//            public void hello() {
//                System.out.println();
//            }
//        };
//        i.hello();

// 3) Using Lambda Expression implement interface

        MyInterf i1= () ->{
            System.out.println("This is using Lambda expression");
        };
        i1.hello();

        MyInterf i2 =() -> System.out.println("This is using Lambda expression");
        i2.hello();

        LenghtInter lenghtInter= str -> str.length();

        System.out.println("length is: "+lenghtInter.getLength("ABCDEFGHI"));
    }
}
