package atividadejavos.exemplodeheransa;

public class Pessoa {
    public String Cpf;
    public String Nome;

    public Pessoa(String cpf, String nome) {
        Cpf = cpf;
        Nome = nome;
    }
    double tirarCopia(int qtd){
        return 0.10 * (double) qtd;
    }
}
