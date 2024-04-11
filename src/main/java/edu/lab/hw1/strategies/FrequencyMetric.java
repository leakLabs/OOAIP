package edu.lab.hw1.strategies;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMetric implements MetricStrategy {
    @Override
    public String getMetrics(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> frMap = new HashMap<>();
        for (String word : words) {
            frMap.put(word, frMap.getOrDefault(word, 0) + 1);
        }

        return frMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }
}
