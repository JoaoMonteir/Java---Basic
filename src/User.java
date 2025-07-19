abstract class User {

    String name;

    void greeting() {
        System.out.println("Olá, " + name + ".");
    }

    abstract void confirm(); // sem corpo
}

class Client extends User {
    @Override
    void confirm(){
        System.out.println("Cadastro confirmado!");
    }
}