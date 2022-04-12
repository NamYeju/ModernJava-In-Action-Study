package Chapter2.복잡한과정간소화.익명클래스_람다;

import java.util.ArrayList;
import java.util.List;

public class colorFilter {
    public static List<Apple> filterApples(List<Apple> inventory, predicateInterface p){
        List<Apple> result = new ArrayList<>();

        // 사과 필터링
        for(Apple apple:inventory){
            if(p.test(apple)) // 이 코드만 보면 어떤 조건에 따라 필터링 하는건지 알 수 없음 = 캡슐화
                result.add(apple);
        }



        return result;
    }

}
