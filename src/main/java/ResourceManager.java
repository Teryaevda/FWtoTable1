import java.util.HashMap;

public class ResourceManager {

    public static final HashMap<Integer, String> MAP_RESOURCE_MANAGER = new HashMap();

    static {
        MAP_RESOURCE_MANAGER.put(0, "-");
        MAP_RESOURCE_MANAGER.put(1, "Марченко Ирина \nТГ: @abuzinaa");
        MAP_RESOURCE_MANAGER.put(2, "-");
        MAP_RESOURCE_MANAGER.put(3, "Кузнецова Алена \nТГ: @alenka_smith_TF");
        MAP_RESOURCE_MANAGER.put(4, "Пауткина Татьяна \nТГ: @TPautkina_TeamForce");
        MAP_RESOURCE_MANAGER.put(5, "-");
        MAP_RESOURCE_MANAGER.put(6, "-");
        MAP_RESOURCE_MANAGER.put(7, "-");
        MAP_RESOURCE_MANAGER.put(8, "Майоров Лев \nТГ: @leothe1");
    }
    public static String getResourceManager(Integer numResourceManager){
        return MAP_RESOURCE_MANAGER.get(numResourceManager);
    }
}

