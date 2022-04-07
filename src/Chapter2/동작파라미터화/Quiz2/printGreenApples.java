package Chapter2.동작파라미터화.Quiz2;

import Chapter2.동작파라미터화.testCode.Apple;
import Chapter2.동작파라미터화.testCode.Color;

public class printGreenApples implements CustomString{
    @Override
    public void print(Apple apple) {
        if(apple.getColor().equals(Color.GREEN))
            System.out.println(apple.getName());
    }
}
