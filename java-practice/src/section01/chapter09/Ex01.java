package section01.chapter09;

public class Ex01 {
    public static void main(String[] args) {

        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕하세요";

        //  ⚠️ 아래와 같이는 사용 불가
        //  컴파일러가 타입을 추론할 수 없는 상황
        // var notInit; // 초기화가 안 됨
        // var nullVar = null; // null로 초기화


        //  ⚠️ 자료형을 변경 불가
        // intNum = 1.23;
        // StringWord = 123;


        //  이후 배울 반복문에서 편리하게 사용
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }



    }
}
