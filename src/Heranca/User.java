package Heranca;

abstract class User {
    //atributo a ser herdado
    String name;

    // métodos a serem herdados
    void greeting() {
        System.out.println("Olá, " + name + ".");
    }

    abstract void confirm(); // método sem corpo
}

class Client extends User {
    void confirm(){
        System.out.println("Cadastro confirmado!"); // método com corpo
    }
}