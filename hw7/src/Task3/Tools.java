package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) { //TODO
        for (int i = end - 1; i >= start; i--) {
            if (list.size() > i && list.get(i).equals(element)) {
                list.remove(i);
            }
        }
        return list;
    }

    public int countCommon(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> commonNums = new ArrayList<>();
        for (Integer num1 : list1) {
            for (Integer num2 : list2) {
                if (num1.equals(num2) && !commonNums.contains(num1)) {
                    commonNums.add(num1);
                }
            }
        }
        return commonNums.size();
    }

    public int maxOccurrences(List<Integer> list) {
        HashMap hm = new HashMap();
        for (Integer num : list) {
            if (hm.containsKey(num)) {
                Integer value = (Integer) hm.get(num);
                hm.put(num, value + 1);
            } else {
                hm.put(num, 1);
            }
        }

        Integer maxOccNum = (Integer) hm.values().toArray()[0];
        for (Object m : hm.keySet()) {
            if ((Integer)hm.get(m) > maxOccNum) {
                maxOccNum = (Integer) hm.get(m);
            }
        }

        return maxOccNum;
    }
}
