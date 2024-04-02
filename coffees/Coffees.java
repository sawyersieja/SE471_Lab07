package coffees;

public class Coffees {
    interface CoffeeIF {
        double getPrice();
    }
    class Regular implements CoffeeIF {
        @Override
        public double getPrice() {
            return 1;
        }
    }
    class Mocha implements CoffeeIF {
        @Override
        public double getPrice() {
            return 2;
        }
    }
    class Latte implements CoffeeIF {
        @Override
        public double getPrice() {
            return 3;
        }
    }

    class Espresso implements CoffeeIF {
        @Override
        public double getPrice() {
            return 4;
        }
    }

    class Cappuccino implements CoffeeIF {
        @Override
        public double getPrice() {
            return 5;
        }
    }

    class Cream implements CoffeeIF {
        @Override
        public double getPrice() {
            return 0.25;
        }
    }

    class Vanilla implements CoffeeIF {
        @Override
        public double getPrice() {
            return 0.50;
        }
    }

    class Cream implements CoffeeIF {
        @Override
        public double getPrice() {
            return 0.25;
        }
    }
}
