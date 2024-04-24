package entities;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo() {
        this(0, 0, 0);
    }

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double p = (this.a + this.b + this.c) / 2.0;

    public double areaTriangulo() {
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    // gets:
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    //sets:
    public void setA(double v) {
        this.a = v;
    }

    public void setB(double v) {
        this.b = v;
    }

    public void setC(double v) {
        this.c = v;
    }
}
