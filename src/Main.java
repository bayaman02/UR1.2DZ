import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Printable tesla = createObject("2");
        Printable bmw = createObject("3");
        Printable honda = createObject("4");


        Printable[] printables = {tesla,bmw,honda};
        for (Printable printable : printables) {
            printable.print();
        }

    }

    public static Printable createObject(String className) {

        switch (className) {
            case "2":
                Tesla tesla = new Tesla("Tesla", 2023, "White");
                return tesla;
            case "3":
                BMW bmw = new BMW("BMW", 2007, 2.4);
                return bmw;
            case "4":
                Honda honda = new Honda("Honda", 2000, 2000);
                return honda;
            default:
                System.out.println("неизвестный дип данных");
                return null;
        }


    }
}
