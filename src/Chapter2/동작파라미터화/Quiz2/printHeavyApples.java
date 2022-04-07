package Chapter2.동작파라미터화.Quiz2;

import Chapter2.동작파라미터화.testCode.Apple;

public class printHeavyApples implements CustomString{
    @Override
    public void print(Apple apple) {
        String s = apple.getWeight() > 150 ? "heavy" : "light";
        System.out.println(apple.getName() + " is " +s);
    }
}
