package C02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FileSizeDiffTest {
    private NumberBox numberBox;

    @BeforeEach
    void beforeEach() {
    }

    @RepeatedTest(10000)
    void small() {
        numberBox = new Small(1);
        numberBox.getNumber();
    }

    @RepeatedTest(10000)
    void big() {
        numberBox = new Big(1);
        numberBox.getNumber();
    }
}
