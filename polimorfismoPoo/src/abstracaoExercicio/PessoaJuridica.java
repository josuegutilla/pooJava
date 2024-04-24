package abstracaoExercicio;

public class PessoaJuridica extends Pessoa {
    private int totalFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int totalFuncionarios) {
        super(nome, rendaAnual);
        this.totalFuncionarios = totalFuncionarios;
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }

    @Override
    public double calcImposto() {
        if (totalFuncionarios >= 10) {
            return (getRendaAnual() * 14) / 100;
        } else {
            return (getRendaAnual() * 16) / 100;
        }
    }
}
