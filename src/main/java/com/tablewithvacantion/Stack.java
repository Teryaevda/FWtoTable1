package com.tablewithvacantion;

import java.util.HashMap;

public class Stack implements Parametrs {
    public static final HashMap<Integer, String> MAP_STACK = new HashMap();
    static {
        MAP_STACK.put(0, "-");
        MAP_STACK.put(1, "Администратор");
        MAP_STACK.put(2, "Ананлитик");
        MAP_STACK.put(3, "Архитектор");
        MAP_STACK.put(4, "Бизнес Аналитик");
        MAP_STACK.put(5, "Дата инженер");
        MAP_STACK.put(6, "Дизайнер");
        MAP_STACK.put(7, "DevOps");
        MAP_STACK.put(8, "QA Auto");
        MAP_STACK.put(9, "QA Нагрузочное");
        MAP_STACK.put(10, "QA Функциональное");
        MAP_STACK.put(11, "Консультант SAP");
        MAP_STACK.put(12, "SAP ABAP");
        MAP_STACK.put(13, "ETL");
        MAP_STACK.put(14, "Full Stack");
        MAP_STACK.put(15, "Project Manager");
        MAP_STACK.put(16, "Системный аналитик");
        MAP_STACK.put(17, "QA Full Stack");
        MAP_STACK.put(18, "Data Science");
        MAP_STACK.put(19, "Android");
        MAP_STACK.put(20, "iOs");
        MAP_STACK.put(21, "Java");
        MAP_STACK.put(22, "Python");
        MAP_STACK.put(23, "Scala");
        MAP_STACK.put(24, "Oracle");
        MAP_STACK.put(25, "JavaScript");
        MAP_STACK.put(26, "React");
        MAP_STACK.put(27, "PHP");
        MAP_STACK.put(28, "Linux");
        MAP_STACK.put(29, "BI");
        MAP_STACK.put(30, "Qlick");
        MAP_STACK.put(31, "SAP BASIS");
        MAP_STACK.put(32, "SAP BW");
        MAP_STACK.put(33, "SAP CA");
        MAP_STACK.put(34, "SAP CO");
        MAP_STACK.put(35, "SAP FI");
        MAP_STACK.put(36, "SAP FS");
        MAP_STACK.put(37, "SAP HANA");
        MAP_STACK.put(38, "SAP IM");
        MAP_STACK.put(39, "SAP LE");
        MAP_STACK.put(40, "SAP LO");
        MAP_STACK.put(41, "SAP MDM");
        MAP_STACK.put(42, "SAP MM");
        MAP_STACK.put(43, "SAP PLM");
        MAP_STACK.put(44, "SAP PM");
        MAP_STACK.put(45, "SAP PO");
        MAP_STACK.put(46, "SAP PP");
        MAP_STACK.put(47, "SAP PS");
        MAP_STACK.put(48, "SAP QM");
        MAP_STACK.put(49, "SAP RCM");
        MAP_STACK.put(50, "SAP RE");
        MAP_STACK.put(51, "SAP SCM");
        MAP_STACK.put(52, "SAP SD");
        MAP_STACK.put(53, "SAP TOPO");
        MAP_STACK.put(54, "SAP TR");
        MAP_STACK.put(55, "SAP UI5");
        MAP_STACK.put(56, "SAP XI");
        MAP_STACK.put(57, "UX/UI");
        MAP_STACK.put(58, "C++");
        MAP_STACK.put(59, "C#");
        MAP_STACK.put(60, "Ruby");
        MAP_STACK.put(61, "1C");
        MAP_STACK.put(62, "Golang");
        MAP_STACK.put(63, "Scrum-мастер");
        MAP_STACK.put(64, "Database Developer");
        MAP_STACK.put(65, "Исследователь");
    }
    public static String getParametrs(Integer numOfCategory){
        return MAP_STACK.get(numOfCategory);
    }
}