package kata3is2;

public class Kata3IS2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("heey");
        histogram.increment("heey");
        histogram.increment("heey");
        histogram.increment("hey");
        histogram.increment("h");
        histogram.increment("h");
        histogram.increment("h");
        histogram.increment("h");
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }

}
