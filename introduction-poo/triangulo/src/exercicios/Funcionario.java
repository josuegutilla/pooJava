package exercicios;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double salary, double tax) {
        this.name = name;
        this.grossSalary = salary;
        this.tax = tax;
    }

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double porcen) {
        double p = (this.grossSalary * porcen) / 100;
        this.grossSalary = netSalary() + p;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.grossSalary;
    }
}
