public class LatteProgram implements ProgramIF {  
   
    @Override
    public CoffeeIF makeCoffee(CoffeeMaker c) {
        c.setPowerLED(0);
        c.setTypeLED(2);
        c.setGrindingTime(4);
        c.setTemperature(150);
        c.holdTemperature(9);
        c.wait(15);
        c.setPowerLED(1);
        return new Coffee(CoffeeIF.CoffeeType.Latte);
    }

}
