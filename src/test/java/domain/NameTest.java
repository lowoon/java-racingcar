package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void create() {
        Name name = new Name("pobi");
        assertThat(name).isNotNull();
    }

    @Test
    void nameWithOverFiveCharacter() {
        assertThatThrownBy(() -> new Name("lowoon"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("이름은 5자 이하만 가능합니다.");
    }

    @Test
    void nameWithEmpty() {
        assertThatThrownBy(() -> new Name(""))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("빈 이름은 사용할 수 없습니다.");
    }
}
