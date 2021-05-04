package domain;

import java.util.Objects;

public class Name {
    private static final int NAME_LENGTH = 5;
    private final String name;

    public Name(String name) {
        if(name == null || name.length() == 0){
            throw new IllegalArgumentException("이름이 입력되지 않았습니다.");
        }

        if(name.length() > NAME_LENGTH){
            throw new IllegalArgumentException("이름 길이가 초과하였습니다.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
