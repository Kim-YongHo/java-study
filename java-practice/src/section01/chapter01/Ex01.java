package section01.chapter01;

public class Ex01 {
    public static void main(String[] args) {


        byte _1b_byte = 1;
        short _2b_short = 2;
        int _4b_int = 3; // ⭐️ 일반적으로 널리 사용
        long _8b_long = 4;

        //  ⚠️ 자료형의 범주 외의 수를 담을 수 없음
        byte overByte1 = 127;
        // byte overByte2 = 128;
        byte overByte3 = -128;
        // byte overByte4 = -129;

        //  큰 자료형에 작은 자료형의 값을 넣을 수 있음
        //  💡 묵시적(암시적) 형변환
        _2b_short = _1b_byte;
        _4b_int = _1b_byte; _4b_int = _2b_short;
        _8b_long = _1b_byte; _8b_long = _2b_short; _8b_long = _4b_int;

        //  ⚠️ 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        //  들어있는 값의 크기와 무관
        // _1b_byte = _2b_short; _1b_byte = _4b_int; _1b_byte = _8b_long;
        // _2b_short = _4b_int; _2b_short = _8b_long;
        // _4b_int = _8b_long;

    }
}
