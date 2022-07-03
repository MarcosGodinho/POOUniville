package Alunos;
public class Pessoa {
    private String Nome;
    private double Trabalho1;
    private double Trabalho2;
    private double Prova1;
    private double NotaFinal;
    
    public Pessoa(String Nome, double Trabalho1, double Trabalho2, double Prova1) {
        this.Nome = Nome;
        this.Trabalho1 = Trabalho1;
        this.Trabalho2 = Trabalho2;
        this.Prova1 = Prova1;
        this.NotaFinal = ((this.Trabalho1 * 0.2) + (this.Trabalho2 * 0.3) + (this.Prova1 * 0.5)) / (0.2 + 0.3 + 0.5);
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    @Override
    public String toString() {
        return "NOTA FINAL " + Nome + ": " + NotaFinal + "\n";
        /**return "Nome: " + Nome + " Trabalho 1: " + Trabalho1 + " Trabalho 2: " + Trabalho2 + " Prova 1: " + Prova1 + " NOTA FINAL : " + NotaFinal + "\n"; */
    }

}