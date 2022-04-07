package Chapter2.동작파라미터화.Quiz2;

import Chapter2.동작파라미터화.testCode.Apple;

import java.util.List;

/** 유연한 prettyPrintApple 구하기
 * 다양한 방법으로 문자열을 생성 (커스터마이즈 된 다양한 toString 메서드와 같이)할 수 있도록 파라미터화 된 메서드롤 구현해라.
 * 각각의 사과 무게 출력 , 사과가 가벼운지 무거운지? 등등
 * */
public class Quiz {
    public static void prettyPrintApple(List<Apple> inventory, CustomString customString){
        for(Apple apple : inventory){
           customString.print(apple);
        }
    }

}
