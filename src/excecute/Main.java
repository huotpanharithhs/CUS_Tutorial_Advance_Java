package excecute;

import model.Fruit;
import util.Util;

public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Fruit("Apple", "Red");
        Fruit apple2 = new Fruit();
        apple2.setColor("Green");
        apple2.setName("Apple");

        apple2 = apple1;

        Fruit banana = new Fruit("Banana", "Green");

        Fruit mango = new Fruit("Mango", "Yellow");

        Util.showMessage(apple2.toString());
        Util.showMessage(apple1.toString());
        Util.showMessage(banana.toString());
        Util.showMessage(mango.toString());
        Util.showMessage(12.0);
    }
}
