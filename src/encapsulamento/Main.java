package encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        // Criando uma instância da classe People
        People p = new People();

        // Definindo valores usando setters
        p.setName("Carlos");
        p.setAge(28);

        // Obtendo valores usando getters
        System.out.println("Nome: " + p.getName());
        System.out.println("Idade: " + p.getAge());
    }
}
