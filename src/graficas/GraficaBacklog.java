/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author admin
 */
public class GraficaBacklog extends JFrame{
    private ChartFrame ventanaa;
    
     public GraficaBacklog(ArrayList semanas, ArrayList backlog){
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("GRÁFICA COMPARATIVA BACKLOG");
        // CARGA DE DATOS EN EL GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for(int i = 0; i < semanas.size(); i++){
            String[] semana = semanas.get(i).toString().split("-");
            datos.setValue((double)backlog.get(i), ""+semana[0], ""+semana[1]);
        }
        
        JFreeChart grafico_barras = ChartFactory.createBarChart("BACKLOG", "SEMANAS" , "PORCENTAJE %", datos, PlotOrientation.VERTICAL, true, true, false);
        
        BufferedImage image = grafico_barras.createBufferedImage(500, 300);
        ChartFrame ventana = new ChartFrame("GRÁFICA COMPARATIVA BACKLOG", null);
        ChartPanel chartPanel = new ChartPanel(grafico_barras); 
        chartPanel.setPopupMenu(null); 
        
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);
        ventana.add(chartPanel);
        
        ventana.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/logo-trans-small.png")));
        ventana.pack();
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventanaa = ventana;
    }
    
    
    public void closeJFrame(){
        ventanaa.dispose();
    }
    
    public ChartFrame getVentana(){
        return ventanaa;
    }
}
