package integrador;

import java.util.Arrays;

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

    /*public Double getModa(){
        double moda = 0;
        if (this.data == null) {
            return 0.0;
        }
        return 0;
    } */
    public Double getMediana() {
        double mediana = 0.0;
        int x = 0;
        //ORDENO LOS DATOS
        Arrays.sort(data);
        x = data.length;
        //DETERMINA SI CONJUNTO DE DATOS ES PAR O IMPAR
        if (x % 2 == 0) {
            double x1 = data[((x - 2) / 2)];
            double x2 = data[x / 2];
            mediana = (x1 + x2) / 2;
        } else {
            mediana = data[(x - 1) / 2];
        }

        return mediana;
    }

    //MEDIDAS DE DISPERSION
    public Double getVarianza() {
        if (this.data == null || this.data.length < 2) {
            return 0.0;
        }
        Double media = this.getMedia();
        Double suma = 0.0;
        for (int fila = 0; fila < this.data.length; fila++) {
            Double xi = this.data[fila];
            suma += Math.pow((xi - media), 2);
        }
        return (suma / (data.length - 1));

    }

    public Double getDesviacionEstandar() {
        if (this.data == null || this.data.length < 1 ) {
            return 0.0;
        }
        Double media = this.getMedia();
        Double suma = 0.0;
        Double desviacionEstandar = 0.0;
        for (int fila = 0; fila < this.data.length; fila++) {
            Double xi = this.data[fila];
            suma += Math.pow((xi - media), 2);
        }
        desviacionEstandar =  (suma / (data.length));

        return  Math.sqrt(desviacionEstandar);

    }

    public Double getDesviacionMedia() {
        if (this.data == null) {
            return 0.0;
        }
        double media;
        double v = 0;
        double varianza = 0;
        double desmed = 0;
        Double suma = 0.0;
        for (int fila = 0; fila < this.data.length; fila++) {
            if (this.data[fila] != null) {
                suma += this.data[fila];
            }
        }
        media = suma / this.data.length;

        for (int fila = 0; fila < this.data.length; fila++) {
            double xi = data[fila];
            suma += Math.abs(xi - media);
        }
        v += data.length - 1;
        desmed += suma / v;

        return desmed;
    }

    public Double getRango() {
        if (this.data == null || this.data.length < 3) {
            return 0.0;
        }
        
        Arrays.sort(this.data);
        
        return this.data[this.data.length-1]-this.data[0];
    }
}
