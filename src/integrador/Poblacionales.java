package integrador;

import java.util.Arrays;

public class Poblacionales implements StadisticsInterface {

    private Double[] data;

    public Poblacionales(String[][] data) {
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

    public Double getModa() {
        double moda = 0.0;
        if (this.data == null) {
            return 0.0;
        }

        int maximaVecesQueSeRepite = 0;

        for (int i = 0; i < this.data.length; i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < this.data.length; j++) {
                if (this.data[i] == this.data[j]) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = this.data[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }
        
        return moda;
    }

    

    public Double getMediana() {
        if (this.data == null || this.data.length < 1) {
            return 0.0;
        }
        Double mediana = 0.0;
        //ORDENO LOS DATOS
        Arrays.sort(this.data);
        //DETERMINA SI CONJUNTO DE DATOS ES PAR O IMPAR
        if (this.data.length % 2 == 0) {
            double p1 = this.data[this.data.length / 2]; //EXPLICAR
            double p2 = this.data[(this.data.length / 2) - 1];
            mediana = (p1 + p2) / 2;
        } else {
            mediana = this.data[((this.data.length + 1) / 2) - 1];
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
        return (suma / (data.length));

    }

    public Double getDesviacionEstandar() {
        if (this.data == null || this.data.length < 1) {
            return 0.0;
        }
        Double media = this.getMedia();
        Double suma = 0.0;
        Double desviacionEstandar = 0.0;
        for (int fila = 0; fila < this.data.length; fila++) {
            Double xi = this.data[fila];
            suma += Math.pow((xi - media), 2);
        }
        desviacionEstandar = (suma / (data.length));

        return Math.sqrt(desviacionEstandar);

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

        return this.data[this.data.length - 1] - this.data[0];
    }
}
