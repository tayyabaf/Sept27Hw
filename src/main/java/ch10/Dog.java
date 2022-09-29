package ch10;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("woof woof");
    }

    public void fetch(){
        System.out.println("*Dog fetching*");
    }
}
