public interface CoffeeIF {
    double getPrice();

    void addCondiment(CondimentType condiment);

    public enum CoffeeType {
        Regular(1, "RegularProgram"),
        Mocha(2, "MochaProgram"),
        Latte(3, "LatteProgram"),
        Espresso(4, "EspressoProgram"),
        Cappuccino(5,"CappuccinoProgram");

        public final double price;
        public final String programLocation;

        private CoffeeType(double price, String programLocation) {
            this.price = price;
            this.programLocation = programLocation;
        }

    }

    public enum CondimentType {
        Cream(0.25, "Cream"),
        Vanilla(0.50, "Vanilla"),
        Chocolate(1, "Chocolate");

        public final double price;
        public final String name;

        private CondimentType(double price, String name) {
            this.price = price;
            this.name = name;
        }

    }
}
