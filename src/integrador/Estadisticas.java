/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

/**
 *
 * @author jose
 */
public class Estadisticas {

    private Double[] data;

    public Estadisticas(String[][] data) {
        this.filterData(data);
    }

    private void filterData(String[][] data) {
        Integer count = 0;
        for (int fila = 0; fila < data.length; fila++) {
            if (data[fila][1] != null) {
                count++;
            }
        }

        if (count == 0) {
            return;
        }
        this.data = new Double[count];
        count = 0;
        for (int fila = 0; fila < data.length; fila++) {
            if (data[fila][1] != null) {

                this.data[count] = Double.parseDouble(data[fila][1]);
                count++;
            }
        }
    }

    public Double getMedia() {
        if (this.data == null) {
            return 0.0;
        }
        Double suma = 0.0;
        for (int fila = 0; fila < this.data.length; fila++) {
            if (this.data[fila] != null) {
                suma += this.data[fila];
            }
        }
        return suma / this.data.length;
    }

}
