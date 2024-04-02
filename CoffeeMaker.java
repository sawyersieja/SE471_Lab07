import java.util.ArrayList;
import java.util.List;

public class CoffeeMaker {
    List<CoffeeIF> receipt = new ArrayList<>();
    void setGrindingTime(int secs) {
        System.out.printf("Grinding for {} seconds.", secs);
    }
    void setTemperature(int degree) {
        System.out.printf("Heating to {} degrees", degree);
    }
    void holdTemperature(int secs){
        System.out.printf("Holding temperature for {} seconds", secs);
    }
    void wait(int secs) {
        System.out.printf("Waiting for {} secs", secs);
    }
    void setPowerLED(int num) {
        System.out.printf("Running: {}", num == 0);
    }
    void setTypeLED(int num) {
        System.out.printf("Program: {}", num);
    }
}