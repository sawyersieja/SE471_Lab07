public class CappuccinoProgram implements ProgramIF {
    
    @Override
    public CoffeeIF makeCoffee(CoffeeMaker c) {
        c.setPowerLED(0);
        c.setTypeLED(4);
        c.setGrindingTime(4);
        c.setTemperature(175);
        c.holdTemperature(10);
        c.wait(15);
        c.setPowerLED(1);
        return new Coffee(CoffeeIF.CoffeeType.Cappuccino);
    }
}
