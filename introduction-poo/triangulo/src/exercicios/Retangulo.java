package exercicios;

public class Retangulo {
    private double width;
    private double heigth;

    public Retangulo(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double area() {
        return this.heigth * this.width;
    }

    public double diagonal() {
        return this.width + this.heigth;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeigth() {
        return this.heigth;
    }
}
