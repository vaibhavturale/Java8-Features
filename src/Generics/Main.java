package Generics;

public class Main {
    public static void main(String[] args) {

        Box<String> box=new Box<>("Water Tank");
        System.out.println(box.display());

        Box<Integer> box1=new Box<>(100);
        System.out.println(box1.display());

    }
}
