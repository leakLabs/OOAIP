package edu.lab.hw1.strategies;

public class WordsCountMetric implements MetricStrategy {
    @Override
    public String getMetrics(String input) {
        String[] words = input.split("\\s+");
        int result = (words.length == 1 && words[0].isEmpty()) ? 0 : words.length;
        return Integer.toString(result);
    }
}
