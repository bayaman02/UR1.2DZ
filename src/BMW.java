public class BMW extends Car {

    private double engine;

    public BMW(String name, int year, double engine) {
        super(name, year);
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }

    @Override
    public void print() {
        System.out.println(" Name: " + getName() + " Year: " + getYear() + " Engine: " + engine);
    }
}
