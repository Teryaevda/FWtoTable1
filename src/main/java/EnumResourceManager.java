import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumResourceManager {

    ENUM_0("-"),
    ENUM_1("Марченко Ирина"),
    ENUM_2("-"),
    ENUM_3("Кузнецова Алена"),
    ENUM_4("Пауткина Татьяна"),
    ENUM_5("-"),
    ENUM_6("-"),
    ENUM_7("-"),
    ENUM_8("Майоров Лев");

    private static final List<String> VALUES_RESOURCE_MANAGER;

    private final String valueResourceManager;

    static {
        VALUES_RESOURCE_MANAGER = new ArrayList<>();
        for (EnumResourceManager enumResourceManager : EnumResourceManager.values()) {
            VALUES_RESOURCE_MANAGER.add(enumResourceManager.valueResourceManager);
        }
    }

    private EnumResourceManager(String value) {
        this.valueResourceManager = value;
    }

    public static List<String> getValuesResourceManager() {
        return Collections.unmodifiableList(VALUES_RESOURCE_MANAGER);
    }
}
