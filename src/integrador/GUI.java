package integrador;

import javax.swing.JOptionPane;

import org.jfree.chart.*;

import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.plaf.PanelUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryToPieDataset;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import org.jfree.data.general.PieDataset;

public class GUI extends javax.swing.JFrame {

    private String[][] data = new String[6][2];

    Integer count = 0;

    private String charTitle = "Notas de Alumnos";

    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jPanel1.setVisible(true);
        this.setVisible(true);
        this.printDataChart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("GRAFICADOR ESTADISTICO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(118, 10, 540, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("TIPO DE GRAFICO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 46, 140, 17);

        jRadioButton1.setText("Lineal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(20, 80, 70, 24);

        jRadioButton2.setText("Barras");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(100, 80, 100, 24);

        jRadioButton3.setText("Circular");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(200, 80, 80, 24);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "Y"
            }
        ));
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");
        jTable1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 257, 117);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mediana:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 160, 59, 14);

        jLabel11.setText("28.138");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(660, 120, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Varianza:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 120, 60, 14);

        jLabel12.setText("15");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 210, 40, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Rango:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 210, 44, 14);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel13.setText("MEDIDAS DE TENDENCIA CENTRAL");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 80, 190, 13);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Moda:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 200, 39, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel14.setText("MEDIDAS DE DISPERSION");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 80, 170, 13);

        jLabel8.setText("13.833");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 120, 100, 17);

        jLabel9.setText("15");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 160, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Media:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 120, 50, 14);

        jLabel10.setText("18");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 200, 40, 17);

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(23, 255, 705, 339);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CALCULAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 620, 120, 29);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(610, 620, 120, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("Desviación Estandar:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(530, 150, 118, 13);

        jLabel17.setText("5.304");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(660, 150, 50, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("Desviación Media:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(530, 180, 101, 13);

        jLabel18.setText("4.833");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(660, 180, 50, 17);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen6.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(300, 60, 420, 190);

        jButton2.setText("Cambiar Título");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 30, 130, 29);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen5.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 740, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        this.printDataChart();


    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void printDataChart() {

        DefaultCategoryDataset dataset;
        PieDataset pieDataset;
        JFreeChart chart;

        if (jRadioButton1.isSelected()) {
            dataset = this.getDataSet();
            chart = ChartFactory.createLineChart(this.charTitle, "Puntaje", "Alumnos", dataset, PlotOrientation.HORIZONTAL, false, true, false);
        } else if (jRadioButton2.isSelected()) {
            dataset = this.getDataSet(); // GETDATASET??
            chart = ChartFactory.createBarChart(this.charTitle, "Puntaje", "Alumnos", dataset, PlotOrientation.VERTICAL, false, false, false);
        } else if (jRadioButton3.isSelected()) {
            pieDataset = this.getPieDataSet();
            chart = ChartFactory.createPieChart(this.charTitle, pieDataset, false, false, false);
        } else {
            jRadioButton1.setSelected(true);
            this.printDataChart();
            return;
        }

        ChartPanel chartPanel = new ChartPanel(chart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();

        this.printEstadisticas();

    }

    private void printEstadisticas() {

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING); //

        Estadisticas estadistica = new Estadisticas(this.data);

        jLabel8.setText(df.format(estadistica.getMedia()));
        //jLabel9.setText(df.format(estadistica.getMediana()));
        jLabel10.setText(df.format(estadistica.getMedia()));
        jLabel11.setText(df.format(estadistica.getVarianza()));
        jLabel17.setText(df.format(estadistica.getDesviacionEstandar()));
        jLabel18.setText(df.format(estadistica.getDesviacionMedia()));
        jLabel12.setText(df.format(estadistica.getRango()));
    }

    private DefaultCategoryDataset getDataSet() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Float num;
        for (int fila = 0; fila < data.length; fila++) {
            if (data[fila][1] != null) {
                num = Float.parseFloat(data[fila][1]);
                dataset.addValue(num, "", data[fila][0]);
            }
        }

        return dataset;
    }

    private PieDataset getPieDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        Double num;
        for (int fila = 0; fila < data.length; fila++) {
            if (data[fila][1] != null) {
                num = Double.parseDouble(data[fila][1]);
                dataset.setValue(data[fila][0], num);
            }
        }

        return dataset;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int fila = 0; fila < 6; fila++) {
            jTable1.setValueAt(null, fila, 0);
            jTable1.setValueAt(null, fila, 1);
        }
        data = new String[6][2];
        this.printDataChart();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        this.printDataChart();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        this.printDataChart();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange

        Float nota;
        data = new String[6][2];

        for (int fila = 0; fila < 6; fila++) {
            if (jTable1.getValueAt(fila, 1) != null) {
                try {
                    nota = Float.parseFloat(String.valueOf(jTable1.getValueAt(fila, 1)));
                    if (nota > 10000 || nota < 0) {
                        throw new Exception("error de nota");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Debe llenar la tabla con datos numericos entre 0-20.");
                    jTable1.setValueAt(null, fila, 1);
                    continue;
                }
                data[fila][0] = String.valueOf(jTable1.getValueAt(fila, 0));
                data[fila][1] = nota + "";
            }
        }
        this.printDataChart();


    }//GEN-LAST:event_jTable1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("");
        String code = JOptionPane.showInputDialog(
                frame,
                "Ingrese el título",
                "Nuevo título",
                JOptionPane.WARNING_MESSAGE
        );

        if (code!= null) {
            this.charTitle = code;
            this.printDataChart();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
