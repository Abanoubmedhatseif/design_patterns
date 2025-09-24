package Structural.Decorator.StarBakr.classes.Decorators;

import Structural.Decorator.StarBakr.classes.Beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeverageFormatter {

    public static String formatDescription(String desc) {
        String[] parts = desc.split(",\\s*");

        Map<String, Integer> countMap = new HashMap<>();
        for (String part : parts) {
            countMap.put(part, countMap.getOrDefault(part, 0) + 1);
        }

        List<String> formatted = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            if (count == 1) {
                formatted.add(name);
            } else if (count == 2) {
                formatted.add("Double " + name);
            } else if (count == 3) {
                formatted.add("Triple " + name);
            } else {
                formatted.add(count + "x " + name);
            }
        }

        return String.join(", ", formatted);
    }
}
