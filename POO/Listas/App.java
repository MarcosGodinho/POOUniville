package Listas;
public class App {
    public static void main(String[] args) {

        PessoaDAO pDao = new PessoaDAO();

        int IdPessoa_1 = 1;
        String NomePessoa_1 = "Marcos";
        Pessoa Pessoa_1 = new Pessoa(IdPessoa_1, NomePessoa_1);
        pDao.addPessoa(Pessoa_1);

        int IdPessoa_2 = 2;
        String NomePessoa_2 = "Enrico";
        Pessoa Pessoa_2 = new Pessoa(IdPessoa_2, NomePessoa_2);
        pDao.addPessoa(Pessoa_2);

        int IdPessoa_3 = 3;
        String NomePessoa_3 = "Sabrina";
        Pessoa Pessoa_3 = new Pessoa(IdPessoa_3, NomePessoa_3);
        pDao.addPessoa(Pessoa_3);
        
        System.out.println(pDao.getPessoas());
        pDao.deletePessoa(Pessoa_3);
        System.out.println(pDao.getPessoas());
        pDao.getById(IdPessoa_1);
        pDao.getById(IdPessoa_3);
        
    }
}