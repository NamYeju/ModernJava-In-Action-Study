package Chapter2.복잡한과정간소화.인터페이스추상화;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Apple> appleInventory = new ArrayList<>();

        appleInventory.add(new Apple("A", Color.GREEN, 130));
        appleInventory.add(new Apple("B", Color.GREEN, 180));
        appleInventory.add(new Apple("C", Color.RED, 220));
        appleInventory.add(new Apple("D", Color.RED, 130));
        appleInventory.add(new Apple("E", Color.GREEN,80));

        //람다 이용
        List<Apple> resultLambdaApples = colorFilter.filterApples(appleInventory, apple -> apple.getColor().equals(Color.GREEN));



    }
}
