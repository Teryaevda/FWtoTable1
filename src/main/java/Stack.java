import java.util.HashMap;

public class Stack implements Parametrs {

    public static final HashMap<Integer, String> MAP_STACK = new HashMap();

    static {
        MAP_STACK.put(0, "-");
        MAP_STACK.put(1, "Full Stack");
        MAP_STACK.put(2, "Консультант SAP");
        MAP_STACK.put(3, "DevOps");
        MAP_STACK.put(4, "Верстальщик");
        MAP_STACK.put(5, "Архитектор");
        MAP_STACK.put(6, "Системный аналитик");
        MAP_STACK.put(7, "Бизнес Аналитик");
        MAP_STACK.put(8, "Ананлитик");
        MAP_STACK.put(9, "Ананлитик");
        MAP_STACK.put(10, "Ананлитик");
        MAP_STACK.put(11, "Ананлитик");
        MAP_STACK.put(12, "Team Lead");
        MAP_STACK.put(13, "Дизайнер");
        MAP_STACK.put(14, "Дизайнер");
        MAP_STACK.put(15, "ETL");
        MAP_STACK.put(16, "Дата инженер");
        MAP_STACK.put(17, "QA Функциональное");
        MAP_STACK.put(18, "QA Auto");
        MAP_STACK.put(19, "QA Нагрузочное");
        MAP_STACK.put(20, "SAP ABAP");
        MAP_STACK.put(21, "Project Manager");
        MAP_STACK.put(22, "Эксперт");
        MAP_STACK.put(23, "Аналитик");
        MAP_STACK.put(24, "Администратор");
        MAP_STACK.put(25, "Project Manager");
        MAP_STACK.put(26, "Исследователь");
        MAP_STACK.put(27, "Team Lead");
        MAP_STACK.put(28, "Администратор");
        MAP_STACK.put(29, "Project Manager");
        MAP_STACK.put(30, "Scrum-мастер");
        MAP_STACK.put(31, "Администратор");
        MAP_STACK.put(32, "QA Full Stack");
        MAP_STACK.put(33, "UI");
        MAP_STACK.put(34, "Android");
        MAP_STACK.put(35, "iOs");
        MAP_STACK.put(36, "Java");
        MAP_STACK.put(37, "Python");
        MAP_STACK.put(38, "Scala");
        MAP_STACK.put(39, "Oracle");
        MAP_STACK.put(40, "JavaScript");
        MAP_STACK.put(41, "React");
        MAP_STACK.put(42, "PHP");
        MAP_STACK.put(43, "Linux");
        MAP_STACK.put(44, "BI");
        MAP_STACK.put(45, "Qlick");
        MAP_STACK.put(46, "FullStack");
        MAP_STACK.put(47, "SAP BASIC");
        MAP_STACK.put(48, "SAP BW");
        MAP_STACK.put(49, "SAP CA");
        MAP_STACK.put(50, "SAP CO");
        MAP_STACK.put(51, "SAP FI");
        MAP_STACK.put(52, "SAP FS");
        MAP_STACK.put(53, "SAP HANA");
        MAP_STACK.put(54, "SAP IM");
        MAP_STACK.put(55, "SAP LE");
        MAP_STACK.put(56, "SAP LO");
        MAP_STACK.put(57, "SAP MDM");
        MAP_STACK.put(58, "SAP MM");
        MAP_STACK.put(59, "SAP PLM");
        MAP_STACK.put(60, "SAP PM");
        MAP_STACK.put(61, "SAP PO");
        MAP_STACK.put(62, "SAP PP");
        MAP_STACK.put(63, "SAP PS");
        MAP_STACK.put(64, "SAP QM");
        MAP_STACK.put(65, "SAP RCM");
        MAP_STACK.put(66, "SAP RE");
        MAP_STACK.put(67, "SAP SCM");
        MAP_STACK.put(68, "SAP SD");
        MAP_STACK.put(69, "SAP TOPO");
        MAP_STACK.put(70, "SAP TR");
        MAP_STACK.put(71, "SAP UI5");
        MAP_STACK.put(72, "SAP XI");
        MAP_STACK.put(73, "UX/UI");
        MAP_STACK.put(74, "C++");
        MAP_STACK.put(75, "C#");
        MAP_STACK.put(76, "Ruby");
        MAP_STACK.put(77, "1C");
        MAP_STACK.put(78, "Golang");
        MAP_STACK.put(79, "Database Developer");
        MAP_STACK.put(80, "Технический писатель");

    }
    public static String getParametrs(Integer numOfCategory){
        return MAP_STACK.get(numOfCategory);
    }
}