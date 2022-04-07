package Chapter2.동작파라미터화.Quiz2;

import Chapter2.동작파라미터화.testCode.Apple;
import Chapter2.동작파라미터화.testCode.Color;

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

        System.out.println("----- 모든 사과 출력 -----");
       Quiz.prettyPrintApple(appleInventory, new printAllApples());

        System.out.println("----- 초록색 사과 출력 -----");
        Quiz.prettyPrintApple(appleInventory, new printGreenApples());

        System.out.println("----- 사과 무게 판별 출력 -----");
        Quiz.prettyPrintApple(appleInventory, new printHeavyApples());
    }
}
