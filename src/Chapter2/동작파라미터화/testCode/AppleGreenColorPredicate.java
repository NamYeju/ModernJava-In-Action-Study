package Chapter2.동작파라미터화.testCode;

public class AppleGreenColorPredicate implements predicateInterface{

    @Override
    public boolean test(Apple apple){
        return apple.getColor().equals(Color.GREEN);
    }
}
