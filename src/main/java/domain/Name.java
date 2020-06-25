package domain;

public class Name {
    private static final int LENGTH_LIMIT = 5;

    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > LENGTH_LIMIT) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("빈 이름은 사용할 수 없습니다.");
        }
    }

    public String getValue() {
        return name;
    }
}
