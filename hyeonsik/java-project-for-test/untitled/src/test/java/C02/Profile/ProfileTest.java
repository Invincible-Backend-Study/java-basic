package C02.Profile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    private Profile profile;

    @BeforeEach
    void beforeEach() throws Exception {
        profile = new Profile();
        profile.setName("Min");
        profile.setAge(20);
    }

    @Test
    @DisplayName("프로필 정보 조회")
    void check_profile() {
        // assertEquals("Min", profile.printName());
        // 책에 나와있는대로 클래스 작성시 테스트가 불가능함
        profile.printName();
        profile.printAge();
    }

}