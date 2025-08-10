package FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private final static Map<String, TreeType> map = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name+"-"+color+"-"+texture;
        if(!map.containsKey(key)) {
            map.put(key, new TreeType(name, color, texture));
        }
        return map.get(key);
    }
}
