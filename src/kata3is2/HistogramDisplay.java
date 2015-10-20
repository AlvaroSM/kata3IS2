package kata3is2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("Histogram");
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 500));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart
                ("Title", "Domain", "Nº email", dataset,
                        PlotOrientation.VERTICAL, false, false, false);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "", "gmail.com");
        dataset.addValue(24, "", "hotmail.com");
        dataset.addValue(4, "", "outlook.com");
        dataset.addValue(8, "", "ulpgc.com");
        return dataset;
    }


    public void execute() {
        setVisible(true);
    }
}
