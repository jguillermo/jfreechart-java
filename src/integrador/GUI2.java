package integrador;

import javax.swing.JOptionPane;

import org.jfree.chart.*;

import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.SystemColor;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import javax.swing.JFrame;
import org.jfree.data.general.PieDataset;

public class GUI2 extends javax.swing.JFrame {

    private String[][] data = new String[50][2];

    Integer count = 0;

    private String charTitle = "Nombre del Titulo";
    private String charTitle2 = "Nombre Eje X";
    private String charTitle3 = "Nombre Eje Y";

    private String typeFrm = "poblacional";

    public GUI2(String typeFrm) {

        this.setTypeFrm(typeFrm);

        initComponents();
        this.setLocationRelativeTo(null);
        this.jPanel1.setVisible(true);
        this.setVisible(true);
        this.printDataChart();
    }

    public void setTypeFrm(String typeFrm) {
        this.typeFrm = typeFrm;
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
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("GRAFICADOR ESTADISTICO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 510, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("TIPO DE GRAFICO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 140, 17);

        jRadioButton1.setText("Lineal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(10, 80, 70, 23);

        jRadioButton2.setText("Barras");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(90, 80, 100, 23);

        jRadioButton3.setText("Circular");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(190, 80, 80, 23);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
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
        jScrollPane1.setBounds(20, 110, 250, 140);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mediana:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 160, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("0");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(740, 120, 70, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Varianza:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 120, 80, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("0");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(740, 210, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Rango:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 210, 80, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("MEDIDAS DE TENDENCIA CENTRAL");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 80, 260, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Moda:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 200, 60, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("MEDIDAS DE DISPERSION");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(610, 80, 190, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 120, 80, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 160, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Media:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 120, 60, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("0");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(430, 200, 70, 15);

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(23, 305, 810, 350);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 270, 120, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Desviación Estandar:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(600, 150, 130, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("0");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(740, 150, 70, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Desviación Media:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(600, 180, 120, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("0");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(740, 180, 80, 15);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CAMBIAR TITULOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 270, 160, 23);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(570, 110, 10, 130);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informacion.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(790, 10, 40, 39);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("POBLACIONAL");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(520, 0, 270, 46);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen 3.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(320, 60, 510, 190);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen 2.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 850, 670);

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
            chart = ChartFactory.createLineChart(this.charTitle, this.charTitle2, this.charTitle3, dataset, PlotOrientation.VERTICAL, false, true, false);
        } else if (jRadioButton2.isSelected()) {
            dataset = this.getDataSet();
            chart = ChartFactory.createBarChart(this.charTitle, this.charTitle2, this.charTitle3, dataset, PlotOrientation.VERTICAL, false, false, false);
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

        StadisticsInterface stadistics;

        if (this.typeFrm == "poblacional") {
            stadistics = new Poblacionales(this.data);
        } else if (this.typeFrm == "muestral") {
            stadistics = new Muestrales(this.data);
        } else {
            return;
        }

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING); //

        jLabel21.setText(stadistics.getTitulo());
        jLabel8.setText(df.format(stadistics.getMedia()));
        jLabel9.setText(df.format(stadistics.getMediana()));
        jLabel10.setText(df.format(stadistics.getModa()));
        jLabel11.setText(df.format(stadistics.getVarianza()));
        jLabel17.setText(df.format(stadistics.getDesviacionEstandar()));
        jLabel18.setText(df.format(stadistics.getDesviacionMedia()));
        jLabel12.setText(df.format(stadistics.getRango()));
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
        for (int fila = 0; fila < 50; fila++) {
            jTable1.setValueAt(null, fila, 0);
            jTable1.setValueAt(null, fila, 1);
        }
        data = new String[50][2];
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
        data = new String[50][2];

        for (int fila = 0; fila < 50; fila++) {
            if (jTable1.getValueAt(fila, 1) != null) {
                try {
                    nota = Float.parseFloat(String.valueOf(jTable1.getValueAt(fila, 1)));
                    if (nota > 10000 || nota < 0) {
                        throw new Exception("error de nota");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Debe llenar la tabla con datos numericos.");
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

        JFrame frame = new JFrame("");
        String code = JOptionPane.showInputDialog(
                frame,
                "Ingrese el Título Principal",
                "Nuevos títulos",
                JOptionPane.WARNING_MESSAGE
        );
        String code2 = JOptionPane.showInputDialog(
                frame,
                "Ingrese Título para Eje X",
                "Nuevos títulos",
                JOptionPane.WARNING_MESSAGE
        );

        String code3 = JOptionPane.showInputDialog(
                frame,
                "Ingrese Título para Eje Y",
                "Nuevos títulos",
                JOptionPane.WARNING_MESSAGE
        );

        if (code != null) {
            this.charTitle = code;
            this.charTitle2 = code2;
            this.charTitle3 = code3;
            this.printDataChart();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame frame = new GUI4("informacionMTC");
        frame.setSize(740, 580);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
