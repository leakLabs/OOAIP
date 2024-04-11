package edu.lab.hw1;

import edu.lab.hw1.strategies.MetricStrategy;

public class MetricCollector {
    private MetricStrategy strategy;

    public MetricCollector(MetricStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MetricStrategy strategy) {
        this.strategy = strategy;
    }

    public String getStringMetrics(String text) {
        return strategy.getMetrics(text);
    }

    public Integer getIntMetrics(String text) {
        return Integer.parseInt(strategy.getMetrics(text));
    }
}
