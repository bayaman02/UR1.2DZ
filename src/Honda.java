public class Honda extends Car {

    private double weight;

    public Honda(String name, int year, double height) {
        super(name, year);
        this.weight = height;
    }

    public double getHeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println(" Name: " + getName() + " Year: " + getYear() + " Weight: " + weight);
    }
}
