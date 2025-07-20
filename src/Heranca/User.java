package heranca;

public class User {
    //atributo a ser herdado
    String name;

    // métodos a serem herdados
    void greeting() {
        System.out.println("Olá, " + name + ".");
    }
}

class Client extends User {
    }