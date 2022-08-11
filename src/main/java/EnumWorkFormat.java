import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumWorkFormat {
    ENUM_0("-"),
    ENUM_1("Офис"),
    ENUM_2("Удаленная работа"),
    ENUM_3("Гибрид");

    private static final List<String> VALUES_WORK_FORMAT;

    private final String valueWorkFormat;

    static {
        VALUES_WORK_FORMAT = new ArrayList<>();
        for (EnumWorkFormat enumWorkFormat : EnumWorkFormat.values()) {
            VALUES_WORK_FORMAT.add(enumWorkFormat.valueWorkFormat);
        }
    }

    private EnumWorkFormat(String value) {
        this.valueWorkFormat = value;
    }

    public static List<String> getValuesWorkFormat() {
        return Collections.unmodifiableList(VALUES_WORK_FORMAT);
    }
}
