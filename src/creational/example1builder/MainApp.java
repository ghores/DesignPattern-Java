package creational.example1builder;

public class MainApp {
    public static void main(String[] args) {
        Pizza pepperoni = new PizzaBuilder()
                .setName("Pepperoni")
                .addSauce()
                .addSalt()
                .addOnionPowder()
                .bake();
    }
}
