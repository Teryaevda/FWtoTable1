import java.util.HashMap;
/* Класс категории:
номер ключа хешмап соответствует номеру возвращаему апи фриентворка
 */
public class Category {

    public static final HashMap<Integer, String> MAP_CATEGORY = new HashMap();

    static {
        MAP_CATEGORY.put(129, "Разработка");
        MAP_CATEGORY.put(151, "Управление");
        MAP_CATEGORY.put(152, "Базы данных");
        MAP_CATEGORY.put(130, "Мобильная разработка");
        MAP_CATEGORY.put(132, "SAP");
        MAP_CATEGORY.put(133, "Аналитика");
        MAP_CATEGORY.put(134, "Дизайн");
        MAP_CATEGORY.put(135, "Тестирование");
        MAP_CATEGORY.put(136, "Прочее");
    }
    public static String getCategory(Integer numOfCategory){
        return MAP_CATEGORY.get(numOfCategory);
    }
}
