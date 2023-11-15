public class Tesla extends Car {

    private String color;

    public Tesla(String name, int year, String color) {
        super(name, year);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(" Name: " + getName() + " Year: " + getYear() + " Color: " + color );
    }
}
