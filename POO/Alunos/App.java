package Alunos;
public class App {
    public static void main(String[] args) {

        AlunosDAO pDao = new AlunosDAO();

        Pessoa Pessoa_1 = new Pessoa("Marcos", 8.0, 10.0, 6.0);
        pDao.addPessoa(Pessoa_1);

        Pessoa Pessoa_2 = new Pessoa("Pedro", 4.0, 8.0, 8.0);
        pDao.addPessoa(Pessoa_2);

        Pessoa Pessoa_3 = new Pessoa("Sabrina", 8.0, 6.0, 8.0);
        pDao.addPessoa(Pessoa_3);
        
        Pessoa Pessoa_4 = new Pessoa("Jorge", 5.0, 6.0, 6.0);
        pDao.addPessoa(Pessoa_4);

        Pessoa Pessoa_5 = new Pessoa("Carlos", 7.0, 8.0, 10.0);
        pDao.addPessoa(Pessoa_5);
        
        System.out.println(pDao.getPessoas());  
    }
}