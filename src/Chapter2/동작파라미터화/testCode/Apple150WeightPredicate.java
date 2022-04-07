package Chapter2.동작파라미터화.testCode;

public class Apple150WeightPredicate implements predicateInterface{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
