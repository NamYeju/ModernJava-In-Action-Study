package Chapter2.동작파라미터화.testCode;

import Chapter2.동작파라미터화.Quiz2.CustomString;
import Chapter2.동작파라미터화.Quiz2.Quiz;

import java.util.ArrayList;
import java.util.List;

import static Chapter2.동작파라미터화.testCode.colorFilter.filterApples;

public class Main {

    public static void main(String[] args) {

        List<Apple> appleInventory = new ArrayList<>();

        appleInventory.add(new Apple("A", Color.GREEN, 130));
        appleInventory.add(new Apple("B", Color.GREEN, 180));
        appleInventory.add(new Apple("C", Color.RED, 220));
        appleInventory.add(new Apple("D", Color.RED, 130));
        appleInventory.add(new Apple("E", Color.GREEN,80));

        //List<Apple> resultApples = colorFilter.filterGreenApples(appleInventory);
        //List<Apple> resultApples = colorFilter.filterApplesByColor(appleInventory, Color.GREEN);
        //List<Apple> resultApples = colorFilter.filterApples(appleInventory, new AppleGreenColorPredicate());

//        for(int i=0; i<resultApples.size(); i++) {
//            System.out.print(resultApples.get(i).getName()+ " ");
//        }

        List<Apple> resultApples= filterApples(appleInventory, new AppleGreenColorPredicate(){
            @Override
            public boolean test(Apple apple){
                return Color.GREEN.equals(apple.getColor());
            }
        });

        List<Apple> resultApples2 = filterApples(appleInventory, (Apple apple) ->
                Color.GREEN.equals(apple.getColor()));


    }
}
