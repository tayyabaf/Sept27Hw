package ch10;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("meow meow");
    }

    public void scratch(){
        System.out.println("*scratching*");
    }
}
