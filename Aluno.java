package atividadejavos.exemplodeheransa;

public class Aluno {
    public int matricula;

    public Aluno(int matricula) {
        this.matricula = matricula;
    }
    double tirarCopia(int qtd){
        return 0.07 * (double) qtd;
    } 
    
}
