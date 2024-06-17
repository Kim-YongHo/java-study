package section05.chapter03.ex03;

public class Main {
    public static void main(String[] args) {

        double sum1 = add2Num(12, 34.56);

//        double sum2 = add2Num("1" + true); // ⚠️ 불가
    }

    //  💡 T는 Number를 상속한 클래스이어야 한다는 조건
    public static <T extends Number> double add2Num(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    //  ❓ 그냥 Number를 인자 자료형으로 하면 되지 않을까?



}
