package abstracaoExercicio;

public class PessoaFisica extends Pessoa {
    private double gastoSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double healthExpenditures() {
        return (this.gastoSaude * 50) / 100;
    }

    @Override
    public double calcImposto() {
        if (getRendaAnual() <= 2000) {
            return ((getRendaAnual() * 15) / 100) - healthExpenditures();
        } else {
            return ((getRendaAnual() * 25) / 100) - healthExpenditures();
        }
    }
}