abstract class User {

    String name;

    // método a ser herdado
    void greeting() {
        System.out.println("Olá, " + name + ".");
    }

    abstract void confirm(); // sem corpo
}

class Client extends User {
    // método próprio da classe
    @Override
    void confirm(){
        System.out.println("Cadastro confirmado!");
    }
}