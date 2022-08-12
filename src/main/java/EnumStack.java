import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumStack {

    ENUM_0("-"),
    ENUM_1("Full Stack"),
    ENUM_2("Консультант SAP"),
    ENUM_3("DevOps"),
    ENUM_4("Верстальщик"),
    ENUM_5("Архитектор"),
    ENUM_6("Системный аналитик"),
    ENUM_7("Бизнес Аналитик"),
    ENUM_8("Ананлитик"),
    ENUM_9("Ананлитик"),
    ENUM_10("Ананлитик"),
    ENUM_11("Ананлитик"),
    ENUM_12("Team Lead"),
    ENUM_13("Дизайнер"),
    ENUM_14("Дизайнер"),
    ENUM_15("ETL"),
    ENUM_16("Дата инженер"),
    ENUM_17("QA Функциональное"),
    ENUM_18("QA Auto"),
    ENUM_19("QA Нагрузочное"),
    ENUM_20("SAP ABAP"),
    ENUM_21("Project Manager"),
    ENUM_22("Эксперт"),
    ENUM_23("Аналитик"),
    ENUM_24("Администратор"),
    ENUM_25("Project Manager"),
    ENUM_26("Исследователь"),
    ENUM_27("Team Lead"),
    ENUM_28("Администратор"),
    ENUM_29("Project Manager"),
    ENUM_30("Scrum-мастер"),
    ENUM_31("Администратор"),
    ENUM_32("QA Full Stack"),
    ENUM_33("UI"),
    ENUM_34("Android"),
    ENUM_35("iOs"),
    ENUM_36("Java"),
    ENUM_37("Python"),
    ENUM_38("Scala"),
    ENUM_39("Oracle"),
    ENUM_40("JavaScript"),
    ENUM_41("React"),
    ENUM_42("PHP"),
    ENUM_43("Linux"),
    ENUM_44("BI"),
    ENUM_45("Qlick"),
    ENUM_46("FullStack"),
    ENUM_47("SAP BASIC"),
    ENUM_48("SAP BW"),
    ENUM_49("SAP CA"),
    ENUM_50("SAP CO"),
    ENUM_51("SAP FI"),
    ENUM_52("SAP FS"),
    ENUM_53("SAP HANA"),
    ENUM_54("SAP IM"),
    ENUM_55("SAP LE"),
    ENUM_56("SAP LO"),
    ENUM_57("SAP MDM"),
    ENUM_58("SAP MM"),
    ENUM_59("SAP PLM"),
    ENUM_60("SAP PM"),
    ENUM_61("SAP PO"),
    ENUM_62("SAP PP"),
    ENUM_63("SAP PS"),
    ENUM_64("SAP QM"),
    ENUM_65("SAP RCM"),
    ENUM_66("SAP RE"),
    ENUM_67("SAP SCM"),
    ENUM_68("SAP SD"),
    ENUM_69("SAP TOPO"),
    ENUM_70("SAP TR"),
    ENUM_71("SAP UI5"),
    ENUM_72("SAP XI"),
    ENUM_73("UX/UI"),
    ENUM_74("C++"),
    ENUM_75("C#"),
    ENUM_76("Ruby"),
    ENUM_77("1C"),
    ENUM_78("Golang"),
    ENUM_79("Database Developer"),
    ENUM_80("Технический писатель");

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
