package C04.ProfilePrint;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfilePrintTest {
    private ProfilePrint profile;

    @BeforeEach
    void beforeEach() throws Exception {
        profile = new ProfilePrint();
        profile.setName("john");
        profile.setAge((byte) 22);
        profile.setMarried(false);
    }

    @Test
    void profile() {
        assertEquals("john", profile.getName());
        assertEquals((byte) 22, profile.getAge());
        assertEquals(false, profile.getMarried());
    }

}