package heranca;

public class Main {
    public static void main (String[] args){

    User c1 = new Client();
    c1.name = "Maria"; // atributo herdado
    c1.greeting(); // métood herdado
    c1.confirm(); // método próprio
    }
}
