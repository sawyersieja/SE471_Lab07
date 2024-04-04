

public class RegularProgram implements ProgramIF {
    @Override
    public CoffeeIF makeCoffee(CoffeeMaker c) {
        Coffee coffee = new Coffee(CoffeeIF.CoffeeType.Regular);
        c.setPowerLED(0);
        c.setTypeLED(0);
        c.setGrindingTime(8);
        c.setTemperature(150);
        c.holdTemperature(2);
        c.wait(15);
        c.setPowerLED(1);
        return coffee;
    }
}
