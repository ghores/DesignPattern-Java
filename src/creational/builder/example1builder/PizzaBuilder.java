package creational.builder.example1builder;

public class PizzaBuilder {
    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
        pizza.setBread(true);
        pizza.setCheese(true);
    }

    public PizzaBuilder setName(String name) {
        pizza.setName(name);
        return this;
    }

    public PizzaBuilder addSauce() {
        pizza.setSauce(true);
        return this;
    }

    public PizzaBuilder addSalt() {
        pizza.setSalt(true);
        return this;
    }

    public PizzaBuilder addBlackPepper() {
        pizza.setBlackPepper(true);
        return this;
    }

    public PizzaBuilder addOnionPowder() {
        pizza.setOnionPowder(true);
        return this;
    }

    public PizzaBuilder addGarlicPowder() {
        pizza.setGarlicPowder(true);
        return this;
    }

    public Pizza bake() {
        return pizza;
    }
}
