package C02.FileSizeDiff;

import org.junit.jupiter.api.RepeatedTest;

public class FileSizeDiffTest {
    @RepeatedTest(10000)
    void small() {
        NumberBox numberBox = new Small(1);
        numberBox.getNumber();
    }

    // 파일 용량이 너무 커서 Big.class는 제외하였습니다.
//    @RepeatedTest(10000)
//    void big() {
//        NumberBox numberBox = new Big(1);
//        numberBox.getNumber();
//    }
}
