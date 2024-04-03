import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;

public class CoffeeMaker {
    private List<CoffeeIF> receipt = new ArrayList<>();
    private ProgramIF program = null;
    void setGrindingTime(int secs) {
        System.out.printf("Grinding for %d seconds.\n", secs);
    }
    void setTemperature(int degree) {
        System.out.printf("Heating to %d degrees\n", degree);
    }
    void holdTemperature(int secs){
        System.out.printf("Holding temperature for %d seconds\n", secs);
    }
    void wait(int secs) {
        System.out.printf("Waiting for %d secs\n", secs);
    }
    void setPowerLED(int num) {
        System.out.printf("Running: %b\n", num == 0);
    }
    void setTypeLED(int num) {
        System.out.printf("Program: %d\n", num);
    }
    void displayPrice(CoffeeIF c) {
        System.out.printf("Cost: %f\n", c.getPrice());
    }
    void displaySaleRecord() {
        for (CoffeeIF c: receipt) {
            System.out.println(c.getPrice());
        }
    }

    public void setChosenCoffeeType(CoffeeIF.CoffeeType type) throws ClassNotFoundException, NoSuchMethodException, InstantiationException,InvocationTargetException, IllegalArgumentException, IllegalAccessException {
        ClassLoader cLoader = this.getClass().getClassLoader();
        Class<?> c = cLoader.loadClass(type.programLocation);
        program = (ProgramIF) c.getConstructor().newInstance();
    }

    public CoffeeIF make() {
        return program.makeCoffee(this);
    }
    public void sell(CoffeeIF c) {
        receipt.add(c);
    }
}