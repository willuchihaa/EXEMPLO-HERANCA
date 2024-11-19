package atividadejavos.exemplodeheransa;

public class Funcionario {
    public double salario;
    public String cargo;
    public Funcionario(double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }
    double tirarCopia(int qtd){
        return 0.10 * (double) qtd;
    }

    
}
