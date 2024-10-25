package Generics;

public class Box<T>{

    T container;

    public Box(T container){
        this.container=container;
    }

    public T display(){
        return this.container;
    }
}
