package section05.chapter03.ex01;

public class Main {
    public static void main(String[] args) {

        //  원시값 배열(double[])을 쓰면 오류 - 배열로는 오토박싱이 안 되므로
        Double[] array1 = new Double[] {
                1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8
        };
        Character[] array2 = new Character[] {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'
        };

        arraySwap(array1, 3, 5);
        arraySwap(array2, 2, 7);

        // 셔플
        for (int i = 0; i < 100; i++) {
            arraySwap(
                    array2,
                    (int) Math.floor(Math.random() * array2.length),
                    (int) Math.floor(Math.random() * array2.length)
            );
        }
    }

    public static <T> void arraySwap (T[] array, int a, int b) {
        if (array.length <= Math.max(a, b)) return;
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
