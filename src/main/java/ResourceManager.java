import java.util.HashMap;

public class ResourceManager {

    public static final HashMap<Integer, String> MAP_RESOURCE_MANAGER = new HashMap();

    static {
        MAP_RESOURCE_MANAGER.put(0, "-");
        MAP_RESOURCE_MANAGER.put(1, "Марченко Ирина \n ТГ: ");
        MAP_RESOURCE_MANAGER.put(2, "-");
        MAP_RESOURCE_MANAGER.put(3, "Кузнецова Алена \n ТГ: ");
        MAP_RESOURCE_MANAGER.put(4, "Пауткина Татьяна \n ТГ: ");
        MAP_RESOURCE_MANAGER.put(5, "-");
        MAP_RESOURCE_MANAGER.put(6, "-");
        MAP_RESOURCE_MANAGER.put(7, "-");
        MAP_RESOURCE_MANAGER.put(8, "Майоров Лев \n ТГ: ");
    }
    public static String getResourceManager(Integer numResourceManager){
        return MAP_RESOURCE_MANAGER.get(numResourceManager);
    }
}

