package encapsulamento;

public class People {
    // Atributos privados
    private String name;
    private int age;

    // Getter para nome
    public String getName() {
        return name;
    }

    // Setter para nome
    public void setName(String nome) {
        this.name = nome;
    }

    // Getter para idade
    public int getAge() {
        return age;
    }

    // Setter para idade
    public void setAge(int idade) {
        if (idade > 0) { // validação simples
            this.age = idade;
        }
    }
}

