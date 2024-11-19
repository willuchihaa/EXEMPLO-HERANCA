package atividadejavos.exemplodeheransa;

public class Professor {
    public double salario;
    public String curso;
    public Professor(double salario, String curso) {
        this.salario = salario;
        this.curso = curso;
    }
    double tirarCopia(int qtd){
        return 0.09 * (double) qtd;
    }

}
