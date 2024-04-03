
public class MochaProgram implements ProgramIF {
    @Override
    public CoffeeIF makeCoffee(CoffeeMaker c) {
        var coffee = new Coffee(CoffeeIF.CoffeeType.Mocha);
        c.setPowerLED(0);
        c.setTypeLED(1);
        c.setGrindingTime(5);
        c.setTemperature(200);
        c.holdTemperature(5);
        coffee.addCondiment(CoffeeIF.CondimentType.Cream);
        coffee.addCondiment(CoffeeIF.CondimentType.Vanilla);
        c.wait(15);
        c.setPowerLED(1);
        return coffee;
    }
}
