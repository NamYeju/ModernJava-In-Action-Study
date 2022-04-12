package Chapter2.복잡한과정간소화.인터페이스추상화;

import java.util.ArrayList;
import java.util.List;

public class colorFilter {
    public static <T> List<T> filterApples(List<T> inventory, predicateInterface<T> p){
        List<T> result = new ArrayList<T>();

        // 제네릭타입으로 추상화하여 이제 사과뿐만 아니라 어떤 과일이든 들어갈 수 있음
        for(T e : inventory){
            if(p.test(e)) // 이 코드만 보면 어떤 조건에 따라 필터링 하는건지 알 수 없음 = 캡슐화
                result.add(e);
        }

        return result;
    }

}
