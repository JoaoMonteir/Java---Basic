package construtor;

public class Car {
    
    String brand, model;
    int year;

    // Construtores
    // O construtor padrão inicializa com valores fixos, sem parametros
    public Car() {
        this.brand = "Ford";
        this.model = "Focus";
        this.year = 2023;
    }

    // Construtor com parâmetros
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void showDetails() {
        System.out.println("A marca do carro é: " + brand);
        System.out.println("O modelo do carro é: " + model);
        System.out.println("O ano do carro é: " + year);
        System.out.println("-------------------------");
    }
}