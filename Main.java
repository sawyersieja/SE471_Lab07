

public class Main {
    public static void main(String[] args) {
        CoffeeMaker c = new CoffeeMaker();
        try {
            c.setChosenCoffeeType(CoffeeIF.CoffeeType.Mocha);
        } catch (Exception e) {
            System.err.println(e);
        }
        CoffeeIF mocha = c.make();
        mocha.addCondiment(CoffeeIF.CondimentType.Chocolate);
        c.displayPrice(mocha);
        c.sell(mocha);
        System.out.println("-------");
        try {
            c.setChosenCoffeeType(CoffeeIF.CoffeeType.Espresso);
        } catch (Exception e) {
            System.err.println(e);
        }
        CoffeeIF espresso = c.make();
        espresso.addCondiment(CoffeeIF.CondimentType.Chocolate);
        espresso.addCondiment(CoffeeIF.CondimentType.Chocolate);
        c.displayPrice(espresso);
        c.sell(espresso);

    }
}
