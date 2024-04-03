import java.util.List;
import java.util.ArrayList;
    public class Coffee implements CoffeeIF{
        List<Double> addOns = new ArrayList<>();
        private double basePrice;
        public Coffee (CoffeeType type){
            System.out.printf("Making %s (+%f)\n", type.toString(), type.price);
            this.basePrice = type.price;
        }
        @Override
        public void addCondiment(CoffeeIF.CondimentType condiment) {
            System.out.printf("Adding %s (+%f)\n", condiment.name, condiment.price);
            addOns.add(condiment.price);
        }
        public double getPrice() {
            var price = basePrice;
            for (double addOn: addOns) {
                price += addOn;
            }
            return price;
        }
    }
