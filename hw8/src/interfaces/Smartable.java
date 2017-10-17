package interfaces;

import java.util.Map;
import java.util.Set;

public interface Smartable {
    boolean isUnique(Map<String, String> map);
    Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2);
    Set<String> removeEvenLength(Set<String> set);
}
