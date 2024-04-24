package exercicios;

public class Estudante {
    public String nameAluno;
    public double notaMinima;
    public double nota1;
    public double nota2;
    public double nota3;

    public Estudante(String name, double nota1, double nota2, double nota3) {
        this.nameAluno = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaMinima = 60;
    }

    public double somaNota() {
        return (this.nota1 + this.nota2 + this.nota3);
    }

    public double pontosRestantes() {
        return this.notaMinima - somaNota();
    }
}
