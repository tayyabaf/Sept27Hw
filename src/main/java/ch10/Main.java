package ch10;

public class Main {
    public static void feed(Animal animal){
        if (animal instanceof Dog) {
            System.out.println("eats dog food");
        }
        if (animal instanceof Cat) {
            System.out.println("eats cat food");
        }
    }
    public static void main(String[] args) {
        Dog rockey = new Dog();
        rockey.fetch();
        rockey.sound();
        feed(rockey);


        Animal sasha = new Dog();
        sasha.sound();
        feed(sasha);

        sasha= new Cat();
        sasha.sound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }
}
