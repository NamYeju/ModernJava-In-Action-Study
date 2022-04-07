package Chapter2.동작파라미터화.Quiz2;

import Chapter2.동작파라미터화.testCode.Apple;

public class printAllApples implements CustomString{
    static int cnt = 1;
    @Override
    public void print(Apple apple){
            System.out.println(cnt + "번째 사과: " + apple.getName());
            cnt++;

    }
}
