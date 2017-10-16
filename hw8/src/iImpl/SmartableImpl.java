package iImpl;

import interfaces.Smartable;
import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.*;

public class SmartableImpl implements Smartable {
    @Override
    public boolean isUnique(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("map can't be null");
        }
        return map.size() == map.values().stream().distinct().count();
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1 == null || map2 == null) {
            throw new NullPointerException("map1 and map2 can't be null");
        }

        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                if (Objects.equals(map1.get(key), map2.get(key))) {
                    result.put(key, map1.get(key));
                }
            }
        }
        return result;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> result = new HashSet<>();
        for (String e : set) {
            if (e != null && e.length() % 2 != 0) {
                result.add(e);
            }
        }
        return result;
    }
}
