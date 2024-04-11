import edu.lab.hw1.MetricCollector;
import edu.lab.hw1.strategies.FrequencyMetric;
import edu.lab.hw1.strategies.WordsCountMetric;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW1Test {
    private MetricCollector collector;
    private final String inputStr = "The quick brown fox jumps over the lazy    dog. The quick brown" +
            " fox jumps over the lazy dog.\n" +
            "This is a test      sentence for word metrics. This test      is for testing purposes.";

    @Test
    void wordsCountTest() {
        collector = new MetricCollector(new WordsCountMetric());

        int result = collector.getIntMetrics(inputStr);

        assertEquals(32, result);
    }

    @Test
    void frTest() {
        collector = new MetricCollector(new FrequencyMetric());

        String result = collector.getStringMetrics(inputStr);

        assertEquals("over", result);
    }

    @Test
    void emptyWordsCountTest() {
        String input = "";
        collector = new MetricCollector(new WordsCountMetric());

        int result = collector.getIntMetrics(input);

        assertEquals(0, result);
    }

    @Test
    void emptyFrTest() {
        String input = "";
        collector = new MetricCollector(new FrequencyMetric());

        String result = collector.getStringMetrics(input);

        assertEquals("", result);
    }
}
