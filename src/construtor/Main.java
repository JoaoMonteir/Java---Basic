package construtor;

public class Main {
    public static void main(String[] args) {
        
        // Criando instâncias de Carro usando diferentes construtores
        // Usando o construtor padrão que inicializa com valores fixos
        Car c1 = new Car();
        c1.showDetails();

        // Usando o construtor com parâmetros
        Car c2 = new Car("Toyota", "Corolla", 2022);
        c2.showDetails();

    }
}
