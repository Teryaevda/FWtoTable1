import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumExpirience {
    ENUM_0("-"),
    ENUM_1("До 3 лет"),
    ENUM_2("От 3 до 5 лет"),
    ENUM_3("От 5 лет");

    private static final List<String> VALUES_EXPIRIENCE;

    private final String valueExpirience;

    static {
        VALUES_EXPIRIENCE = new ArrayList<>();
        for (EnumExpirience enumExpirience : EnumExpirience.values()) {
            VALUES_EXPIRIENCE.add(enumExpirience.valueExpirience);
            }
        }

    private EnumExpirience(String value) {
        this.valueExpirience = value;
    }

    public static List<String> getValuesExpirience() {
        return Collections.unmodifiableList(VALUES_EXPIRIENCE);
    }
}
