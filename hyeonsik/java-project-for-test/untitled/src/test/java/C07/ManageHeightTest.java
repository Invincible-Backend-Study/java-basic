package C07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManageHeightTest {
    private ManageHeight manageHeight;

    @BeforeEach
    void before() {
        manageHeight = new ManageHeight();
        manageHeight.setData();
    }

    @Test
    void printHeight() {
        for (int i = 0; i < 5; i++) {
            manageHeight.printHeight(i);
        }
    }

    @Test
    void printAverage() {
        int i = 0;
        while (i < 5) {
            manageHeight.printAverage(i);
            i++;
        }
    }
}