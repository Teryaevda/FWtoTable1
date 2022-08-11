import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumStack {

    ENUM_0("-"),
    ENUM_1("Марченко Ирина"),
    ENUM_2("-"),
    ENUM_3("Кузнецова Алена"),
    ENUM_4("Пауткина Татьяна"),
    ENUM_5("-"),
    ENUM_6("-"),
    ENUM_7("-"),
    ENUM_8("Майоров Лев"),
    ENUM_9("-"),
    ENUM_10("Марченко Ирина"),
    ENUM_11("-"),
    ENUM_12("Кузнецова Алена"),
    ENUM_13("Пауткина Татьяна"),
    ENUM_14("-"),
    ENUM_15("-"),
    ENUM_16("-"),
    ENUM_17("Майоров Лев"),
    ENUM_18("-"),
    ENUM_19("Марченко Ирина"),
    ENUM_20("-"),
    ENUM_21("Кузнецова Алена"),
    ENUM_22("Пауткина Татьяна"),
    ENUM_23("-"),
    ENUM_24("-"),
    ENUM_25("-"),
    ENUM_26("Майоров Лев"),
    ENUM_27("-"),
    ENUM_28("Марченко Ирина"),
    ENUM_29("-"),
    ENUM_30("Кузнецова Алена"),
    ENUM_31("Пауткина Татьяна"),
    ENUM_32("-"),
    ENUM_33("-"),
    ENUM_34("-"),
    ENUM_35("Майоров Лев"),
    ENUM_36("-"),
    ENUM_37("Марченко Ирина"),
    ENUM_38("-"),
    ENUM_39("Кузнецова Алена"),
    ENUM_40("Пауткина Татьяна"),
    ENUM_41("-"),
    ENUM_42("-"),
    ENUM_43("-"),
    ENUM_44("Майоров Лев"),
    ENUM_45("-"),
    ENUM_46("Марченко Ирина"),
    ENUM_47("-"),
    ENUM_48("Кузнецова Алена"),
    ENUM_49("Пауткина Татьяна"),
    ENUM_50("-"),
    ENUM_51("-"),
    ENUM_52("-"),
    ENUM_53("Майоров Лев"),
    ENUM_54("-"),
    ENUM_55("Марченко Ирина"),
    ENUM_56("-"),
    ENUM_57("Кузнецова Алена"),
    ENUM_58("Пауткина Татьяна"),
    ENUM_59("-"),
    ENUM_60("-"),
    ENUM_61("-"),
    ENUM_62("Майоров Лев"),
    ENUM_63("-"),
    ENUM_64("Марченко Ирина"),
    ENUM_65("-"),
    ENUM_66("Кузнецова Алена"),
    ENUM_67("Пауткина Татьяна"),
    ENUM_68("-"),
    ENUM_69("-"),
    ENUM_70("-"),
    ENUM_71("Майоров Лев"),
    ENUM_72("Майоров Лев"),
    ENUM_73("-"),
    ENUM_74("Марченко Ирина"),
    ENUM_75("-"),
    ENUM_76("Кузнецова Алена"),
    ENUM_77("Пауткина Татьяна"),
    ENUM_78("-"),
    ENUM_79("-"),
    ENUM_80("-"),
    ENUM_81("Майоров Лев");


    private static final List<String> VALUES_STACK;

    private final String valueEnumStack;

    static {
        VALUES_STACK = new ArrayList<>();
        for (EnumStack enumStack : EnumStack.values()) {
            VALUES_STACK.add(enumStack.valueEnumStack);
        }
    }

    private EnumStack(String value) {
        this.valueEnumStack = value;
    }

    public static List<String> getValueEnumStack() {
        return Collections.unmodifiableList(VALUES_STACK);
    }
}
