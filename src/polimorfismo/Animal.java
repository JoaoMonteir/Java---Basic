package polimorfismo;

public class Animal {

    void Sound(){
        System.out.println("O animal faz um som.");
    }
}

class Dog extends Animal {
    @Override
    void Sound(){
        System.out.println("O cachorro late.");
    }
}