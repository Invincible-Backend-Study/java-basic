package C04.ByteOverflow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitiveTypes {
    @Test
    void crease_checkByte_overflow() {
        byte byteMin = -128;
        byte byteMax = 127;

        byteMin--;
        byteMax++;

        assertEquals(-128, byteMax);
        assertEquals(127, byteMin);
    }

}
