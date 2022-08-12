import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumGrade {

    ENUM_0("-"),
    ENUM_1("Junior"),
    ENUM_2("Middle"),
    ENUM_3("Senior"),
    ENUM_4("K1"),
    ENUM_5("K2"),
    ENUM_6("K3"),
    ENUM_7("K4"),
    ENUM_8("K5");

    private static final List<String> VALUES_GRADE;

    private final String valueGrade;

    static {
        VALUES_GRADE = new ArrayList<>();
        for (EnumGrade enumGrade : EnumGrade.values()) {
            VALUES_GRADE.add(enumGrade.valueGrade);
        }
    }

    private EnumGrade(String value) {
        this.valueGrade = value;
    }

    public static List<String> getValuesGrade() {
        return Collections.unmodifiableList(VALUES_GRADE);
    }
}

